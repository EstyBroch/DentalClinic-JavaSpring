package com.example.springdentists.Controller;

import com.example.springdentists.model.Appointment;
import com.example.springdentists.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @GetMapping
    public List<Appointment> getEmployees(){
        return appointmentService.getAll();
    }

    @GetMapping("/{id}")
    public Appointment getById(@PathVariable int id){
        return  appointmentService.getById(id);
    }
    @PostMapping
    public void  add(@RequestBody Appointment appointment){
        appointmentService.add(appointment);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody Appointment appointment)
    {
        appointmentService.update(id,appointment);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id)
    {
        appointmentService.delete(id);
    }
}
