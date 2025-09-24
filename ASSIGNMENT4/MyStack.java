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
                return (E) temp.data;
            }

            Node curr = stack;

            while (curr.next.next != null) {
                curr = curr.next;
            }//go to second to last node
            Node temp=curr.next;
            curr.next=null;
            size--;
            return (E) temp.data;
        }

    public E top(){
        if (size==0){
            return null;
        }
        else if(size==1){
            return (E) stack.data;
        }
        Node curr=stack;
        while(curr.next!=null){
            curr=curr.next;
        }
        return (E) curr.data;
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
