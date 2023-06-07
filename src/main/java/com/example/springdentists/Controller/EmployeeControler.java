package com.example.springdentists.Controller;

import com.example.springdentists.model.Employee;
import com.example.springdentists.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {
@Autowired
EmployeeService employeeService;
    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.getAll();
    }

@GetMapping("/{id}")
public Employee getById(@PathVariable int id){
        return  employeeService.getById(id);
}
@PostMapping
public void  add(@RequestBody Employee employee){
        employeeService.add(employee);
}
@PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody Employee employee)
{
    employeeService.update(id,employee);
}
@DeleteMapping("/{id}")
public void delete(@PathVariable int id)
{
    employeeService.delete(id);
}
}
