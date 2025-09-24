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
    public E pop(){
        if (size==0){
            return null;
        }
        if (size==1){
            size--;
                Node temp=stack;
                stack = null;
                return temp.data;
            }

            Node curr = stack;

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
