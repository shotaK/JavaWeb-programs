package com.javaweb;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(50);

        ArrayList<String> stringArrayList = new ArrayList<String>(15);

        ArrayList signs = new ArrayList();
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
        signs.add("7-Up: You Like It, It Likes You");
        signs.add("Dr. Pepper 10, 2, 4");

        System.out.print(signs.get(2));

        ArrayList<String> nums = new ArrayList<String>();
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");
        nums.add(2, "two and half");

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for (String num : nums) {
            System.out.println(num);
        }

        System.out.println(nums.indexOf("two"));

        System.out.println(nums);

        ArrayList<String> nums2 = new ArrayList<String>();
        nums2.add("one");
        nums2.add("two");
        nums2.add("three");
        nums2.add("four");

        Iterator iter = nums2.iterator();
        while (iter.hasNext()) {
            String str = (String) iter.next();
            System.out.println("iterator item: " + str);
        }

        ArrayList<String> nums3 = new ArrayList<String>();
        nums3.add("one");
        nums3.add("two");
        nums3.add("three");
        System.out.println(nums3);
        nums3.set(0, "first");
        nums3.set(1, "second");
        nums3.set(2, "three");
        System.out.println(nums3);

        nums3.remove("first");
        System.out.println(nums3);

        nums3.clear();
        System.out.println(nums3);

    }

    public static void printArrayList(ArrayList arrayList) {
        System.out.println();
        for (Object item : arrayList) {
            System.out.println(item);
        }
    }
}

















