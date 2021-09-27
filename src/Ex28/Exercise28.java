package Ex28;/*
UCF COP3330 FALL 2021 ASSIGNMENT 28 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        for(int i = 0; i < 5; i++){
            int number = 0;
            System.out.println("Enter a number: ");
            number = scan.nextInt();
            total += number;

        }
        System.out.println("The total is " + total + ".");
    }
}
