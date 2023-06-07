package com.example.springdentists.Repository;

import com.example.springdentists.model.ERole;
import com.example.springdentists.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class TempDB {
    public static List<Employee> Employee =new ArrayList<>();

    static {

        Employee.add(new Employee(1,"aa","23423","23423@sdfs", ERole.manager,"2342342"));
        Employee.add(new Employee(2,"dd","6787","45756@sdfs", ERole.manager,"2342342"));
        Employee.add(new Employee(3,"ff","567","347@sdfs", ERole.manager,"asds"));
        Employee.add(new Employee(4,"vv","356756","sdfh@sdfs", ERole.manager,"sdf"));
        Employee.add(new Employee(5,"zz","42342","sfdh@sdfs", ERole.manager,"2342342"));

    }

//    public List<com.example.springdentists.Model.Employees> getEmployees() {
//        return Employees;
//    }
//
//    public void setEmployees(List<com.example.springdentists.Model.Employees> employees) {
//        Employees = employees;
//    }
}
