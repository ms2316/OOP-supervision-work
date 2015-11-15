package com.linkedlist;

public class Main {

    public static void main(String[] args) {

    Stack astack = new Stack();

        astack.push(0);
        astack.push(1);
        astack.push(2);
        astack.push(3);
        astack.push(4);
        astack.push(5);
        System.out.println(astack.getSize());           // size of stack = 6
        System.out.println(astack.pop() + astack.pop());//4+5 evaluated, removes last two added
        System.out.print(astack.getSize());             // size now 4;


    }
}
