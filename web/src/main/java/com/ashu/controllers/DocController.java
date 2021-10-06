package com.ashu.controllers;

import com.ashu.service.doctor.DoctorService;

import com.ashu.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping(path = "/doctors")
    public List<Doctor> getAllDocs(){
        return doctorService.getAllDocs();
    }
}
