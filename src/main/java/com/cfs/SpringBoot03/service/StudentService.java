package com.cfs.SpringBoot03.service;

import com.cfs.SpringBoot03.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService{

    private List<Student> studentList = new ArrayList<>();

    public StudentService() {
        studentList.add(new Student(41, "Priya", 89));
        studentList.add(new Student(29, "Kariya", 95));
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public Student getStudentListById(int id){
         for(Student student:studentList){
             if(student.getRollnumber()==id){
              return student;
             }
         }
         return null;
    }
}

