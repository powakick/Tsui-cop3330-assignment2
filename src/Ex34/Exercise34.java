package Ex34;/*

UCF COP3330 FALL 2021 ASSIGNMENT 34 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;
import java.util.*;

public class Exercise34 {
    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        String remove;
        ArrayList<String> employees = new ArrayList<String>();
        {

            employees.add("John Smith");
            employees.add("Jackie Jackson");
            employees.add("Chris Jones");
            employees.add("Amanda Cullen");
            employees.add("Jeremy Goodwin");

        }
        System.out.println("There are 5 employees :" + employees);

        System.out.println("Enter an employee name to remove: ");
        remove = scan.nextLine();

        if (employees.contains(remove))
        {
            employees.remove(remove);
            System.out.println("There are 4 employees: " + employees);
        } else{
            System.out.println("The name " +remove +" does not exist");
        }


    }
}
