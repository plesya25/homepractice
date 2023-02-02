/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycodecoverage;

/**
 *
 * @author ukiel
 */
public class Student {
 
    private int id;
    private String name;
    private StudentType type;
    private int math;
    private int sci;
    private int eng;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", type=" + type + ", math=" + math + ", sci=" + sci + ", eng=" + eng + '}';
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    
    //Empty constructor 
    public Student() {
    }

    
    //Custom constructor 
    public Student(int id, String name, StudentType type, int math, int sci, int eng) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }
    
    public String getGrade() {
        int total = this.math + this.sci + this.eng;
        float avg = total /3.0f;
        if (avg <60) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
    
    
}  

