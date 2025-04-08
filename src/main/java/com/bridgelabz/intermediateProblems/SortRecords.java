package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortRecords {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\intermediateProblems\\output.csv"));
            CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\intermediateProblems\\output.csv",true))){
            List<String[]> list = new ArrayList<>();
            String[] line;
            while((line= reader.readNext())!=null){
                if(line.length>1){
                    list.add(line);
                }
            }

            list.sort((a,b)->{
                return Integer.parseInt(a[3])-Integer.parseInt(b[3]);
            });

//            System.out.print(list);
            for(String[] i:list){
                System.out.println(Arrays.toString(i));
                writer.writeNext(i);
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
