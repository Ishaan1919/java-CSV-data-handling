package com.bridgelabz.BasicProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRows {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\studentData.csv"))){
            br.readLine();
            String line;
            int records = 0;
            while((line=br.readLine())!=null){
                if(!line.isEmpty()){
                    System.out.println(line);
                    records++;
                }
            }
            System.out.println("Number of records: " + records);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
