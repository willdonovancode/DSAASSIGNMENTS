package ASSIGNMENT4;

public class MyStack<E>{
    private int size=0;
    public Node stack;
    public MyStack(){

    }
    public void push(E data){
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
    public void pop(){

    }
            private class Node
        {
            private int data;  //data field
            private MyStack next; //link field

            public Node(int item) //constructor method
            {
                data = item;
                next = null;
            }
        }
}
