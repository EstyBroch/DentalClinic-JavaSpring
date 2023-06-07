package com.example.springdentists.Service;

import com.example.springdentists.model.Patient;
import com.example.springdentists.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public List<Patient> getAll (){
        return (List<Patient>) patientRepository.findAll();
    }
    public Patient getById (int id){
        return patientRepository.findById(id).orElse(null);
    }

    public void add (Patient patient){
        patientRepository.save(patient);
    }

    public void update (int id, Patient patient){
        Patient p= patientRepository.findById(id).get();
        patient.setId(p.getId());
        patientRepository.save(patient);
    }

    public void delete(int id){
        patientRepository.deleteById(id);
    }
}
