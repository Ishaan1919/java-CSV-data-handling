package com.bridgelabz.advancedProblems;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVToObject {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\advancedProblems\\studentDetails.csv");
            CsvToBean<Student> cb = new CsvToBeanBuilder<Student>(reader)
                    .withType(Student.class)
                    .withIgnoreEmptyLine(true)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Student> list = cb.parse();
            for(Student i:list){
                System.out.println(i.roll + " " + i.name + " " + i.department + " " + i.number);
                }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
