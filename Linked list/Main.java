package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(0);//0
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);//7
        list.remove(6);
        list.remove(0);
        list.remove(1);

        System.out.println(list.size());


        for(int i= 0; i< list.size();i++){
            System.out.println(list.nth(i));
        }
    }
}
