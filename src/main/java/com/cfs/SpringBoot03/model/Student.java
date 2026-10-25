package com.cfs.SpringBoot03.model;

public class Student {
    private int rollnumber;
    private String name;
    private int marks;

    public Student(int rollnumber, String name, int marks) {
        this.rollnumber = rollnumber;
        this.marks = marks;
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
