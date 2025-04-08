package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class SearchRecords {
    public static void main(String[] args) throws CsvValidationException, IOException {

        String name = "Ishaan";
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\studentData.csv"))) {
            String[] line;

            while ((line = reader.readNext())!=null) {
                if (line.length > 1) {
                    if (line[1].equalsIgnoreCase(name)) {
                        System.out.println("Name: " + line[1] + ", Department: " + line[2] + ", Salary: " + line[3]);
                    }
                }
            }
        } catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}
