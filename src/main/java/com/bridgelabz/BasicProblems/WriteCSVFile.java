package com.bridgelabz.BasicProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-csv-data-handling\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\studentData.csv",true))){
            bw.newLine();
            String[] arr = {"1,Ishaan,cse,10","2,Hitesh,cse,5","2,Hitesh,cse,5","2,Hitesh,cse,5","2,Hitesh,cse,5"};
            for(String i:arr){
                bw.write(i + "\n");
            }
//            bw.write();
//            bw.write(arr[1] + "\n");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
