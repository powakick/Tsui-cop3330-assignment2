package Ex24;/*
UCF COP3330 FALL 2021 ASSIGNMENT 24 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstword, secondword;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.println("Enter the first string: ");
        firstword = scan.nextLine();

        System.out.println("Enter the second string: ");
        secondword = scan.nextLine();
        if (isAnagram(firstword, secondword))
            System.out.println(firstword + " and " + secondword + " are anagrams");
        else
            System.out.println(firstword + " and " + secondword + " are not anagrams");
    }
        public static boolean isAnagram(String firstword, String secondword){

            if(firstword.length() != secondword.length())
                return false;
            int [] freq = new int [26];
            for(int i = 0; i <firstword.length(); i++){

                freq[firstword.charAt(i)-'a']++;

                freq[secondword.charAt(i)-'a']--;
            }
            for(int x : freq){
                if(x!=0)
                    return false;
            }
            return true;

        }

    }


