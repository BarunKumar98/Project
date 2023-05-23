package com.project.Controller;

import com.project.Entities.StudentLead;
import com.project.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

@PostMapping
    public ResponseEntity<StudentLead> saveLead(@RequestBody StudentLead student){
    return ResponseEntity.status(HttpStatus.CREATED).body(studentService.saveLead(student));
}
@GetMapping
 public List<StudentLead> getAllLeads(){
    List<StudentLead> alleads = studentService.getAllLeads();
    return alleads;
 }
 @GetMapping("/{id}")
  public StudentLead getStudentById(@PathVariable long id){
     Optional<StudentLead> studentById = studentService.getLeadById(id);
     return studentById.get();

 }
 @DeleteMapping("/{id}")
 public String deletebyStudentId(@PathVariable long id){
    studentService.deleteLeadById(id);
    return "Record Deleted!";
 }
 @PutMapping
 public ResponseEntity<StudentLead> updateStudentLead(@RequestBody StudentLead studentLead){

     return ResponseEntity.status(HttpStatus.CREATED).body(studentService.saveLead(studentLead));
 }

}
