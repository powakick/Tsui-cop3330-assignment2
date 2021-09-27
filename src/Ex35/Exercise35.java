package Ex35;/*
UCF COP3330 FALL 2021 ASSIGNMENT 35 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class Exercise35 {
    public static void main(String[] args)
    {
        ArrayList<String> names= new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String input;

        System.out.println("Enter a name: ");
        input = scan.nextLine();
        names.add(input);

        while(input != ""){
            System.out.println("Enter a name: ");
            input = scan.nextLine();

            names.add(input);


        }
        int last = names.size() -1;
        names.remove(last);
        System.out.println(names);

        Random random = new Random();
        int random_num = random.nextInt(names.size());

        System.out.println("The winner is... " +names.get(random_num));



    }
}
