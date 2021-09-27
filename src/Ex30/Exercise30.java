package Ex30;/*
UCF COP3330 FALL 2021 ASSIGNMENT 30 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        int [][] multiply = new int[12][12];

       for(int i=0;i < multiply.length; i++){
           for(int j=0; j < multiply.length; j++){
               multiply[i][j] = (i+1) * (j+1);
           }
       }
       for (int i=0; i < multiply.length; i++){
           for(int j=0; j< multiply.length; j++) {
               System.out.print(multiply[i][j] + " ");
           }
           System.out.println(" ");

           }
       }


    }


