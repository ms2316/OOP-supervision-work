package com.company;


public class LinkedList{

    private Node head;
    public LinkedList(){}

    // NODE CLASS
    private class Node{
        private int value;//stores two values, an int and a reference to the next node
        private Node next;

        private Node(int element){
            value = element;
        }

        public int getValue(){
            return value;
        }//getter for value stored in an element of the list

        public void setNext(Node nextnode){
            next = nextnode;
        }//setter for next node in the list

        public Node getNext(){
            return next;
        }//gets next element of a list when applied to a node
    }


    public boolean isEmpty(){
        return head == null;
    }//checks to see if list is empty

    public int nth(int index){
        //head is a node
        Node reference = head;
        for(int i = 0; i<index; i++){
        reference = reference.getNext();
        }
        return reference.getValue();
    }// iterates through look then returns value at index

    public int size(){
        int size = 0;
        Node current = head;
        while(current!=null){
            size++;
            current = current.getNext();
        }
        return size;
    }

    public void add(int newnode){
        if(isEmpty()){
            head = new Node(newnode); //if list is empty the head node is assigned the new node value
        }else{
            Node current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(new Node(newnode));
        } // iterates through the list until the last element is reached, where a new node is placed.
    }


    public void remove(int index){
        int currentIndex = 0; //index of list being evaluated initialised
        Node current = null;
        Node previous = null;
        if(head==null){
            System.out.print("Empty list"); // if list is empty cannot remove anything
        }else{
            current = head;
            while((current != null) && (currentIndex != index)){   //iterates through list until the index element being removed is reached, or till the list runs out.
                currentIndex++;
                previous=current;
                current = current.getNext();
            }
            if(current == head && currentIndex==index){
                head = head.getNext();
            }//if removing head or first element
            else{
                if(current!=null){
                    previous.setNext(current.getNext());
                }//current cell removed, reference to the previous node is pointed to the reference to two nodes infront and the middle node is removed by the garbage collector later on.
            }
        }
    }



    public boolean cycles(LinkedList list){
        if(head==null) { //single element list has no cycles
            return false;
        }

        Node slow = head; //set a slow pointer
        Node fast= head;  //set a fast pointer

        while(true){ //keeps iterating pointers around list until a result is found

            slow=slow.getNext(); //set speed of slow pointer to 1 element per iteration

            if(fast != null) fast = fast.getNext().getNext(); //checks if the pointer is not at end/null pointer then goes twice the speed of s, or two elements per iteration
            else return false;

            if(slow==null || fast == null) return false; // if either hits null/end there is no loop

            if (slow==fast) return true; // if they meet at the same node a cycle is found

        }


    }

}
