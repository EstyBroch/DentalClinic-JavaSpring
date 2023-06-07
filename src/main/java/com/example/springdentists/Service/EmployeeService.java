package com.example.springdentists.Service;

import com.example.springdentists.model.Employee;
import com.example.springdentists.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee>getAll (){
        return (List<Employee>) employeeRepository.findAll();
    }
    public Employee getById (int id){
        return employeeRepository.findById(id).orElse(null);
    }

    public void add (Employee employee){
         employeeRepository.save(employee);
    }

    public void update (int id, Employee employee){
      Employee e= employeeRepository.findById(id).get();
      employee.setId(e.getId());
      employeeRepository.save(employee);
    }

    public void delete(int id){
        employeeRepository.deleteById(id);
    }
}
