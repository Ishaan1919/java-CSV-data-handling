package com.bridgelabz.advancedProblems;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class Student{
    @CsvBindByName
    String roll;
    @CsvBindByName
    String name;
    @CsvBindByName
    String department;
    @CsvBindByName
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

public class CSVToObject {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\advancedProblems\\studentDetails.csv");
            CsvToBean<Student> cb = new CsvToBeanBuilder<Student>(reader)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Student> list = cb.parse();
            for(Student i:list){
                System.out.println(i.name + " works in " + i.department);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
