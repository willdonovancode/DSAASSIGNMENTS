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

            while (curr.next.next != null) {
                curr = curr.next;
            }//go to second to last node
            Node temp=curr.next;
            curr.next=null;
            size--;
            return temp.data;
        }

    public E top(){
        if (size==0){
            return null;
        }
        else if(size==1){
            return stack.data;
        }
        Node curr=stack;
        while(curr.next!=null){
            curr=curr.next;
        }
        return curr.data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
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
