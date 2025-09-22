package ASSIGNMENT4;/*
  This class define a linked list that stores integer values.
  The class does NOT use Head and Tail pointer as the textbook class deos.
*/

// Name: Will Donovan
// Class: CS 3305/Section 01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: INTELLIJ

import java.util.*;
public class LinkedList_No_HT
{
   public Node ListName;


   //constructor method to create a list object with a specifc name. 
   public LinkedList_No_HT()
   {
      ListName = null;
   }
  
   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (ListName == null) {
          ListName = new Node(data);
      }//one node list
      else 
      {
         Node temp = ListName;
         while (temp.next != null) 
         {
            temp = temp.next;
         }
         
         temp.next = new Node(data); //link new node as last node
      }
   }
  
   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
         //complete this method
       if (ListName==null){
           ListName=new Node(data);
           return;
       }
       else{
           Node temp=ListName;
           ListName=new Node(data);
           ListName.next=temp;
       }
   }
     
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
         //complete this method
       int i=1;
       if (index==1){
           addFirstNode(data);
           return;
       }
       Node Current=ListName;
       while (i<index-1){
           Current=Current.next;
           i++;
       }
       Node temp=Current.next;
       Current.next=new Node(data);
       Current.next.next=temp;
   }
      
      
   //method #3: remove first node
   public void removeFirstNode()
   {
         //complete this method
       if (ListName==null){
           System.out.println("List is empty");
           return;
       }
       ListName=ListName.next;
   }
      
      
   //method #4: remove last node
   public void removeLastNode()
   {
         //complete this method

       if (ListName == null) {
           //list is empty
           System.out.println("List is empty");
           return;
       }

       if (ListName.next == null) {
           //one node list
           ListName = null;
           return;
       }

       Node curr = ListName;

       while (curr.next.next != null) {
           curr = curr.next;
       }//go to second to last node
        curr.next=null;

   }

    
   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
         //complete this method
       if (ListName==null){
           System.out.println("List is empty");
           return;
       }
       if (index==1){
           ListName=ListName.next;
           return;
       }
       if (index==countNodes()){
           removeLastNode();
           return;
       }
       else{
           int i=1;
           Node Current=ListName;
           while (i<index-1 && Current.next!=null){
               Current=Current.next;
               i++;
           }
           Current.next=Current.next.next;
       }

   }
          
   //method #6: countNodes
   public int countNodes()
   {
       int listSize= 0;
       Node curr=ListName;
       if(ListName==null){
           System.out.println("List is empty");
       }
       if (ListName!=null){
           while(curr!=null){
               listSize++;
               curr=curr.next;
           }
       }
           //complete this method to return the list size.

           return listSize;
       }

   
   //method #7: pritnInReverse (must be a Recursive method)
   public void printInReverseRecursive(Node L)
   {
       if (L==null){
          return;
       }
       else{
           printInReverseRecursive(L.next);
           System.out.print(L.data+" ");
           }

      //complete this method as recursive method to ptint the list in revers order.
   }   

   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = ListName;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

