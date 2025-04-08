package com.bridgelabz.advancedProblems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ValidateData {
    public static void main(String[] args) {
        String email = "^[\\w]+[\\w.+]*@[A-Za-z]+(?:\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z]{2,}$";
        String phone = "^[6-9]{1}[0-9]{9}$";

        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\advancedProblems\\studentDetails.csv"))){
            reader.readNext();
            String[] line;
            while((line=reader.readNext())!=null){
                String mail = line[1];
                String number = line[2];
                if(mail.matches(email) && number.matches(phone)){
                    System.out.println(Arrays.toString(line) + " This is a valid record");
                }
                else{
                    System.out.println("The record does not have valid value");
                }
            }
        } catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}
