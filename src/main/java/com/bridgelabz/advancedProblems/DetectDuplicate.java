package com.bridgelabz.advancedProblems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicate {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\advancedProblems\\students1.csv"))){
            reader.readNext();

            Set<String> set = new HashSet<>();
            String[] line;
            while((line=reader.readNext())!=null){
                if(set.contains(line[0])){
                    System.out.println("This is a duplicate record: " + Arrays.toString(line));
                }
                set.add(line[0]);
            }

        } catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}
