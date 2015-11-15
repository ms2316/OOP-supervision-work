package com.linkedlist;


public class Stack {


    private int size=0;
    private Node first;
                                //Node class
    private class Node{
        private int value;
        private Node next;      // Node contains the values of the int and reference to the node added before it

        public Node(int element){value = element;
        }

        public Node() {
        }
    }


    public Stack(){}

    public Stack push(int value){
        Node current = first;
        first = new Node();
        first.value=value;
        first.next =current;
        size++;
        return this; //returns a stack of a newly added integer value, to the previous stack
    }

    public int pop(){
        if (first==null) System.out.println("No stack");

        int value = first.value;
        first = first.next;
        size--;
        return value;
    }

    public int getSize(){
        return size;
    }
}
/*
Linked list type implementation has a constant O(1) time, as no arrays need to be resized
even removing/popping is O(1) in time as only a reference is modified.
Traversing takes 0(n) time but as only the first element is wanted it is less necessary.



* */