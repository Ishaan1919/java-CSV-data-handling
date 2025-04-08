package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FilterRecords {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\studentData.csv"))){
            String[] line;
                reader.readNext();
            while((line = reader.readNext())!=null){
                if(line.length>1){
                    int num = Integer.parseInt(line[3]);
                    if(num>=80){
                        System.out.println(Arrays.toString(line));
                    }
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
