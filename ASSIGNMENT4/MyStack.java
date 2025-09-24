package ASSIGNMENT4;

// Name: Will Donovan
// Class: CS 3305/Section01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: INTELLIJ

public class MyStack<E>{
    private int size=0;
    public Node<E> stack;
    public MyStack(){

    }
    public void push(E data){
        //adds not to end of stack
        if(size==0){
            stack=new Node(data);
            size++;
            return;
        }
        else{
            Node temp = stack;
            while (temp.next != null)
            {
                temp=temp.next;
            }

            temp.next = new Node(data);
            size++;
        }
    }
    public E pop(){
        //removes and returns last value of stack
        if (size==0){
            return null;
        }
        if (size==1){
            size--;
                Node<E> temp=stack;
                stack = null;
                return  temp.data;
            }
            Node<E> curr = stack;
            while (curr.next.next != null) {
                curr = curr.next;
            }//go to second to last node
            Node<E> temp=curr.next;
            curr.next=null;
            size--;
            return temp.data;
        }

    public E top(){
        //returns top element of stack
        if (size==0){
            return null;
        }
        else if(size==1){
            return stack.data;
        }
        Node<E> curr=stack;
        while(curr.next!=null){
            curr=curr.next;
        }
        return curr.data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(stack==null){
            return true;
        }
        return false;
    }
    public void printList()
    {
        Node<E> temp;
        temp = stack;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private class Node<E>
        {
            private E data;  //data field
            private Node next; //link field

            public Node(E item) //constructor method
            {
                data = item;
                next = null;
            }
        }
}
