package Ex26;/*
UCF COP3330 FALL 2021 ASSIGNMENT 26 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Exercise26 {
    public static void main(String[] args){

        double i, b, p;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your balance?");
        b = scan.nextDouble();

        System.out.println("What is the APR on the card (as a percent)");
        i = scan.nextDouble();
        i = i / 100;
        i = (i/365);

        System.out.println("What is the monthly payment you can make?");
        p = scan.nextDouble();

        double Months;
        double power = Math.pow((1+i),30);

        Months = -(1) * (Math.log(1+((b*(1-power))/p)));

        Months = Months / 30;
        Months = Months / (Math.log(1+i));

        System.out.println("It will take you " + Math.ceil(Months) + " months to pay off this card.");



    }
}
