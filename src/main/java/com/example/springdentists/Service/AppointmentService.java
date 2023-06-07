package com.example.springdentists.Service;

import com.example.springdentists.model.Appointment;
import com.example.springdentists.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;
    public List<Appointment> getAll (){
        return (List<Appointment>) appointmentRepository.findAll();
    }
    public Appointment getById (int id){
        return appointmentRepository.findById(id).orElse(null);
    }

    public void add (Appointment appointment){
        appointmentRepository.save(appointment);
    }

    public void update (int id, Appointment appointment){
        Appointment e= appointmentRepository.findById(id).get();
        appointment.setId(e.getId());
        appointmentRepository.save(appointment);
    }

    public void delete(int id){
        appointmentRepository.deleteById(id);
    }
}
