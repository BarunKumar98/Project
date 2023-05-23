package com.project.Service;

import com.project.Entities.StudentLead;
import com.project.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepo;

    public StudentLead saveLead(StudentLead lead) {

       return studentRepo.save(lead);

    }
    public List<StudentLead> getAllLeads() {

        List<StudentLead>  lead = studentRepo.findAll();
        return lead;
    }

    public Optional<StudentLead> getLeadById(long id) {

        return studentRepo.findById(id);
    }

    public void deleteLeadById(long id) {

        studentRepo.deleteById(id);
    }

}
