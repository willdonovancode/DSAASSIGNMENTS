package ASSIGNMENT4;
// Name: Will Donovan
// Class: CS 3305/Section01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: INTELLIJ
//import ASSIGNMENT4.MyStack;

import java.util.Scanner;

public class CheckPalindrome {
    //checks if palindrome
    public static String isPalindrome(String s) {
        s=s.toLowerCase();
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        int index = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() != s.charAt(index)) {
                return "Not Palindrome";
            }
            index++;
        }


        return "Palindrome";
    }

    public static void main(String[] args) {
        boolean running = true;

        Scanner input = new Scanner(System.in);
        String s = "";
        while (running) {
            System.out.println("-----------------MAIN MENU---------------");
            System.out.println("1 – Read input string of words");
            System.out.println("2 – Check palindrome and display outputs");
            System.out.println("3 - Exit program");
            System.out.println("Enter option number: ");
            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter input string: ");
                    s = input.nextLine();
                    break;
                case 2:
                    System.out.println("Entered String: " + s);
                    System.out.println("Judgement: " + isPalindrome(s));
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    running=false;
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;

            }

        }
    }
}