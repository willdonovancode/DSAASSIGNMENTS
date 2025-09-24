package ASSIGNMENT4;//my project is on github

// Name: Will Donovan
// Class: CS 3305/Section01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: INTELLIJ

import java.util.Scanner;
public class TestMyStack {

    public static void main (String[] args) {
        boolean running=true;
        Scanner input=new Scanner(System.in);

        MyStack<Integer> stack=new MyStack<>();

        while (running){
            System.out.println("--------MAIN MENU-------");
            System.out.println("1 – Push element");
            System.out.println("2 – Pop element");
            System.out.println("3 – Get top element");
            System.out.println("4 – Get stack size");
            System.out.println("5 – Is empty stack?");
            System.out.println("6 - Print stack");
            System.out.println("7 - Exit program");
            System.out.println("Enter option number:");
            int option=input.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter value to add as first node: ");
                    int data = input.nextInt();
                    //display list before adding first node
                    System.out.println("Adding value " + data + " as first node.");
                    if(!stack.isEmpty()){
                        System.out.print("Stack content before adding " + data + " is: ");
                        stack.printList();
                        System.out.println();
                    }
                    else{
                        System.out.println("Stack is empty.");
                    }
                    stack.push(data);
                    System.out.print("Stack content after adding " + data + " is: ");
                    stack.printList();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Removing from top of stack...");
                    System.out.print("Stack content before removing last element is: ");
                    stack.printList();
                    System.out.println();
                    //System.out.println(stack.pop());
                    stack.pop();
                    System.out.print("Stack content after removing last element is: ");
                    stack.printList();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Retrieving last element from stack: ");
                    System.out.println(stack.top());
                    break;
                case 4:
                    if (stack.isEmpty()){
                        System.out.println("The stack is empty!");
                    }
                    else {
                        System.out.println("The size of the stack is: " + stack.size());
                    }
                    break;
                case 5:
                    if (stack.isEmpty()){
                        System.out.println("The stack is empty!");

                    }
                    else{
                        System.out.println("The stack is not empty.");
                    }
                    break;
                case 6:
                    System.out.println("Printing stack...");
                    stack.printList();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Enter a valid number please!");
                    break;
            }
        }
    }
}

