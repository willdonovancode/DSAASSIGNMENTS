package ASSIGNMENT4;// Add your header here

// Name: Will Donovan
// Class: CS 3305/Section 01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: INTELLIJ


import java.util.*;
public class myTest_No_HT
{
    public static void main (String[] args)
    {
        LinkedList_No_HT myList = new LinkedList_No_HT(); //create a list object
        //create scanner to read input
        Scanner scanner=new Scanner(System.in);
        //declare loop condition
        int option=0;
        do {
            System.out.println("---------MAIN MENU--------");
            System.out.println("1 – Add First Node");
            System.out.println("2 – Add Last Node");
            System.out.println("3 – Add At Index");
            System.out.println("4 – Remove First Node");
            System.out.println("5 – Remove Last Node");
            System.out.println("6 – Remove At Index");
            System.out.println("7 – Print List Size");
            System.out.println("8 – Print List Forward");
            System.out.println("9 – Print List In Reverse");
            System.out.println("10 – Exit program");
            System.out.print("Enter option number: ");
             option = scanner.nextInt();
             //1-6 must print list before and after
            //3-6 say invalid index
            //4-6,8-9 must say list is empty
             switch (option) {
                 case 1:
                     System.out.print("Enter value to add as first node: ");
                     int data = scanner.nextInt();
                     if (myList.countNodes()==0){
                        //does print list is empty if it is empty
                     }
                     else{
                         //display list before adding first node
                         System.out.println("Adding value " + data + " as first node.");
                         System.out.print("List content before adding " + data + " is: ");
                         myList.printList();
                         System.out.println();
                     }
                        myList.addFirstNode(data);
                        System.out.print("List content after adding " + data + " is: ");
                        myList.printList();
                        System.out.println();

                     break;
                 case 2:
                     System.out.println("Add Last Node selected.");
                     System.out.print("Enter value to add as last node: ");
                     data = scanner.nextInt();
                     if (myList.countNodes()==0){
                         //does print empty if empty (it's built in into cound nodes)
                     }
                     else{
                         System.out.println("Adding value " + data + " as last node.");
                         System.out.print("List content before adding " + data + " is: ");
                         myList.printList();
                         System.out.println();
                     }
                     //get user input
                     myList.addLastNode(data);
                     System.out.print("List content after adding " + data + " is: ");
                     myList.printList();
                     System.out.println();
                     break;
                 case 3:
                    System.out.print("Enter index to add at (starting from 1): ");
                    int indexToAdd = scanner.nextInt();
                    System.out.print("Enter value to add: ");
                    int valueToAdd = scanner.nextInt();
                    int size = myList.countNodes();
                    if (indexToAdd < 1 || indexToAdd > size) {
                        System.out.println("Invalid index, try again");
                    } else {
                        System.out.println("Adding value " + valueToAdd + " at index " + indexToAdd + ".");
                        if (myList.countNodes()==0){
                            //prints empty!! no need to put anything here
                        }
                        else {
                            System.out.print("List content before adding at index is: ");
                            myList.printList();
                            System.out.println();
                        }
                        myList.addAtIndex(indexToAdd, valueToAdd);
                        System.out.print("List content after adding at index is: ");
                        myList.printList();
                        System.out.println();
                    }
                     break;
                 case 4:
                     if (myList.ListName == null) {
                         System.out.println("List is empty");
                     } else {
                         System.out.print("List content before removing first node is: ");
                         myList.printList();
                         System.out.println();
                         myList.removeFirstNode();
                         System.out.print("List content after removing first node is: ");
                         myList.printList();
                         System.out.println();
                     }
                     break;
                 case 5:
                    if (myList.ListName == null) {
                    System.out.println("List is empty");
                     }
                    else {
                        //prints list before and after
                        System.out.print("List content before removing last node is: ");
                        myList.printList();
                        System.out.println();
                        myList.removeLastNode();
                        System.out.print("List content after removing last node is: ");
                        myList.printList();
                        System.out.println();
                    }
                     break;
                 case 6:
                     System.out.println("Remove At Index selected.");
                     System.out.print("Enter index to remove: ");
                     int indexToRemove = scanner.nextInt();
                     size = myList.countNodes();
                     if (indexToRemove < 1 || indexToRemove > size) {
                         System.out.println("Invalid index, try again");
                     } else {
                         System.out.println("Removing node at index " + indexToRemove + ".");
                         System.out.print("List content before removing at index is: ");
                         myList.printList();
                         System.out.println();
                         myList.removeAtIndex(indexToRemove);
                         System.out.print("List content after removing at index is: ");
                         myList.printList();
                         System.out.println();

                     }
                     break;
                 case 7:
                     if (myList.ListName==null){
                         System.out.println("List is Empty");
                     }
                     else{
                         System.out.println("List size is: "+myList.countNodes());
                     }
                     break;
                 case 8:
                     System.out.println("Print List Forward selected.");
                     if (myList.ListName==null){
                         System.out.println("List is empty");

                     }
                     else {
                         myList.printList();
                         System.out.println();
                     }
                     break;
                 case 9:
                     System.out.println("Print List In Reverse selected.");
                     if (myList.ListName==null){
                         System.out.println("List is empty");
                     }
                     else {
                         myList.printInReverseRecursive(myList.ListName);
                         System.out.println();
                     }
                     break;
                 case 10:
                     System.out.println("Exiting program...");
                     break;
                 default:
                     System.out.println("Invalid option. Please try again.");
             }
        }while (option != 10);
        System.out.println();
    }
}


