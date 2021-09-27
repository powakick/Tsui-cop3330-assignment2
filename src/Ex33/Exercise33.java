package Ex33;/*
UCF COP3330 FALL 2021 ASSIGNMENT 33 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;
import java.util.Random;

public class Exercise33 {
    public static void main(String[] args)
    {

        String question;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int random_num = random.nextInt(3);

        String[] magic = {"Yes", "No", "Maybe", "Ask again later."};

        System.out.println("What's your question");
        question = scan.nextLine();
        System.out.println(magic[random_num]);

    }
}
