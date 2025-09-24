package ASSIGNMENT4;
// Name: Will Donovan
// Class: CS 3305/Section01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: INTELLIJ
import java.util.*;
public class ReverseString {
    public static String reverseString(String s,MyStack stack){
        String[] arr=s.split("\\s");
        String[] temp=new String[arr.length];
        for (int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        stack.printList();
        int index=0;
        while (!stack.isEmpty()){
            temp[index]=stack.pop().toString();
            index++;
        }
        return String.join(" ",temp);

    }
    public static  void main(String[] args){
        boolean running=true;
        MyStack<String> stack= new MyStack<>();
        Scanner input=new Scanner(System.in);
        String s="";
        while(running){
            System.out.println("-----------------MAIN MENU---------------");
            System.out.println("1 – Read input string of words");
            System.out.println("2 – Reverse string and display outputs");
            System.out.println("3 - Exit program");
            System.out.println("Enter option number: ");
            int option=input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter input string: ");
                    s=input.nextLine();
                    break;
                case 2:
                    System.out.println("Entered String: "+s);
                    System.out.println("Reversed String: "+reverseString(s,stack));
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;

            }

        }
    }
}
