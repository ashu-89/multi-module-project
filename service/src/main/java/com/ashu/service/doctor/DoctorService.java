package com.ashu.service.doctor;

import com.ashu.model.doctor.Doctor;
import com.ashu.repository.doctor.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @PostConstruct
    public void populateDb(){
        Doctor doc1 = new Doctor(1,"Dr. Rashmi Saboo", "BDS");
        Doctor doc2 = new Doctor(2, "Dr. R'eal", "BDSM");
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doc1);
        doctors.add(doc2);
        doctorRepo.saveAll( doctors );
    }

    public List<Doctor> getAllDocs() {
        return doctorRepo.findAll();
    }
}
