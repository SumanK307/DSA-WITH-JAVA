package _06_ARRAY_LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class D01_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Wrapper class
        Integer i =Integer.valueOf(4);
        Float j = Float.valueOf(5.5f);
        System.out.println(i+" "+j);        //4 5.5

        ArrayList<Integer> l1 = new ArrayList<>();
        //Add new element
        l1.add(5);
        l1.add(9);
        l1.add(15);
        l1.add(3);
    }
}
