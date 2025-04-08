package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSVFile {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\studentData.csv"));
            CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\intermediateProblems\\output.csv"))){

            String[] line;

            while ((line= reader.readNext())!=null){
                if(line.length>1){
                    String department = line[2];
                    if(department.equalsIgnoreCase("IT")){
                        int salary = Integer.parseInt(line[3]);
                        salary+=salary/10;
                        line[3] = String.valueOf(salary);
                        writer.writeNext(line);
                    }
                }
            }

        } catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}
