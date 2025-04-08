package com.bridgelabz.advancedProblems;

public class Student{
//    @CsvBindByName
    public String roll;
//    @CsvBindByName
    String name;
//    @CsvBindByName
    String department;
//    @CsvBindByName
    String number;

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }
}
