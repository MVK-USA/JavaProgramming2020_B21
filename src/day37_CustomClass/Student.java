package day37_CustomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public LocalDate DofB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, String ID, char gender, LocalDate DofB, double gpa) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.DofB = DofB;
        age = LocalDate.now().getYear()-DofB.getYear();
        this.gpa = gpa;
    }
    public void getInfo() {
        System.out.println("Student name : " + name + "\nStudent ID   : " + ID + "\ngpa: "
                + gpa + "\nAge: " + age + "\nGender: " + gender);
    }




}
/*
1. Student: Attributes: name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
 */
