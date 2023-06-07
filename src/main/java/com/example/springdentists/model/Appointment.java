package com.example.springdentists.model;

import jakarta.persistence.*;

@Entity
public class Appointment {
    public Appointment(int id, Patient patient, EType type, EStatus status, String date, String time) {
        this.id = id;
        this.patient = patient;
        this.type = type;
        this.status = status;
        this.date = date;
        this.time = time;
    }

    public Appointment() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //private int patientId;
    private EType type;
    private  EStatus status;
    private String date;
    private String time;
    @ManyToOne
   private Patient patient;
    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setId(int id) {
    this.id = id;
    }

    //public int getPatientId() {
   //     return patientId;
   // }

   // public void setPatientId(int patientId) {
   //     this.patientId = patientId;
   // }

    public EType getType() {
        return type;
    }

    public void setType(EType type) {
        this.type = type;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public LocalTime getTime() {
//        return time;
//    }
//
//    public void setTime(LocalTime time) {
//        this.time = time;
//    }




}
