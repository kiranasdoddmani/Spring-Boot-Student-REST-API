package com.cfs.SpringBoot03.controller;

import com.cfs.SpringBoot03.model.Student;
import com.cfs.SpringBoot03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return  studentService.getStudentList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        Student student=studentService.getStudentListById(id);
        if(student==null){
           return ResponseEntity.notFound().build();
 //     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Data");
          }
        return  ResponseEntity.ok(student);
    }
}
