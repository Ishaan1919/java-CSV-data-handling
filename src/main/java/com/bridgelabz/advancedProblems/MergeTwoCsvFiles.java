package com.bridgelabz.advancedProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCsvFiles {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\advancedProblems\\students1.csv"));
            CSVReader reader1 = new CSVReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\advancedProblems\\students2.csv"));
            CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\advancedProblems\\studentDetails.csv",true));){
            reader.readNext();

            Map<String,String[]> map = new HashMap<>();
            String[] line;
            while((line=reader.readNext())!=null){
                String id = line[0];
                String name = line[1];
                String age = line[2];
                String[] temp = {id,name,age,"",""};
                map.put(id,temp);
            }

            reader1.readNext();
            while((line=reader1.readNext())!=null){
                String id = line[0];
                String marks = line[1];
                String grade = line[2];
                if(map.containsKey(id)){
                    String[] temp = map.get(id);
                    temp[3] = marks;
                    temp[4] = grade;
                    map.put(id,temp);
                }
            }

            writer.writeNext(new String[]{"Id","Name","Age","Marks","Grade"});
            for(String key:map.keySet()){
                String[] arr = map.get(key);
                if(arr[3].isEmpty() || arr[4].isEmpty()){
                    System.out.println("This record can not be merged: " + key + " " + Arrays.toString(arr));
                }
                else{
                    writer.writeNext(arr);
                }
            }

        } catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}
