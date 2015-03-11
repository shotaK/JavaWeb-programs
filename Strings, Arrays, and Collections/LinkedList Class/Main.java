package com.javaweb;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        LinkedList<String> linkedList2 = new LinkedList<String>();

        linkedList2.add("one");
        linkedList2.add("two");
        linkedList2.add("three");
        linkedList2.add("four");
        linkedList2.add("five");

        linkedList2.addFirst("zero");
        linkedList2.add(3, "two and half");
        printLinkedList(linkedList2);

        LinkedList signs = new LinkedList();
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
        signs.add("7-Up: You Like It, It Likes You");
        signs.add("Dr. Pepper 10, 2, 4");

        signs.pop();
        printLinkedList(signs);

        LinkedList<String> linkedList3 = new LinkedList<String>();
        linkedList3.add("one");
        linkedList3.add("two");
        linkedList3.add("three");

        linkedList3.set(0, "first");
        printLinkedList(linkedList3);

        linkedList.remove(2);
    }

    public static void printLinkedList(LinkedList linkedList) {
        System.out.println();
        for (Object item : linkedList) {
            System.out.println(item);
        }
    }
}

















