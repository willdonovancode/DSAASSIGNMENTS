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
        // use "head" of list as the top of stack for O(1) pop, push, and top
        Node<E> newNode = new Node(data);
        newNode.next=stack;
        stack=newNode;
        size++;
    }
    public E pop() {
        //removes and returns top value of stack
        if (size == 0) {
            return null;
        }
        E val =stack.data;
        stack=stack.next;
        size--;
        return val;
    }

    public E top(){
        //returns top element of stack
        if(size==0){
            return null;
        }
        //return first node
        return stack.data;
    }
    public int size(){
        //returns size of stack
        return size;
    }
    public boolean isEmpty(){
        //checks if stack is empty
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
