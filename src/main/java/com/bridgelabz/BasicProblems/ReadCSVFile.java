package com.bridgelabz.BasicProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\studentData.csv"))){
            String line;
            boolean header = true;
            while((line=br.readLine())!=null){
                String[] col = line.split(",");
                if(header){
                    System.out.println(line);
                    header = false;
                }
                else{
                    System.out.printf("Id: %s, Name: %s, Age: %s, Marks: %s\n",col[0],col[1],col[2],col[3]);
                }
            }
            System.out.println("Csv file reading done successfully");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
