package _06_ARRAY_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D01_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Wrapper class
        Integer i = Integer.valueOf(4);
        Float j = Float.valueOf(5.5f);
        System.out.println(i+" "+j);        //4 5.5

        ArrayList<Integer> l1 = new ArrayList<>();
        //Add new element
        l1.add(5);
        l1.add(9);
        l1.add(15);
        l1.add(3);
        //get an element at index i
        System.out.println(l1.get(2));  // 15

        //print through loop
        for (int k = 0; k < l1.size(); k++) {
            System.out.print(l1.get(k)+" ");    // 5,9,15,3
        }
        System.out.println();
        
        //print directly
        System.out.println(l1);             // 5,9,15,3

        //adding element at index i 
        l1.add(1,20);       //5,20,9,15,3
        System.out.println(l1);

        //modify at index i
        l1.set(2,13);       //5,20,13,15,3
        System.out.println(l1);

        //removing an Element at index i
        l1.remove(3);               //5,20,13,3
        System.out.println(l1);

        //removing an element
        l1.remove(Integer.valueOf(5));  //20,13,3
        System.out.println(l1);

        //check element is exist
        boolean ans = l1.contains(Integer.valueOf(3));
        System.out.println(ans);
        //if you dont specify class you can put everything 
        ArrayList l = new ArrayList<>();
        l.add("hkldfj");
        l.add(4);
        l.add(true);
        System.out.println(l);
        
        // Q.1 Reverse array list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(10);
        list.add(45);
        list.add(22);
        System.out.println("Original List"+list);
        Collections.reverse(list);
        System.out.println("Original List"+list);
    }
}
