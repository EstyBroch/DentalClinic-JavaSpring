package com.example.springdentists.Controller;

import com.example.springdentists.model.Patient;
import com.example.springdentists.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @GetMapping
    public List<Patient> getEmployees(){
        return patientService.getAll();
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable int id){
        return  patientService.getById(id);
    }
    @PostMapping
    public void  add(@RequestBody Patient patient){
        patientService.add(patient);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody Patient patient)
    {
        patientService.update(id,patient);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id)
    {
        patientService.delete(id);
    }
}
