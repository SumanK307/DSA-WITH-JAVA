package _04_STRING;

import java.util.Scanner;

public class D01_Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String n = sc.nextLine();
        System.out.println(n);
        System.out.println("Enter a new String:");
        String m = sc.next();
        System.out.println(m);
        String name = "suman";
        String fullName = "suman kumar";
        String sentance = "My name is Suman kumar:";
        System.out.println(name);
        System.out.println(fullName);
        System.out.println(sentance);
    }
}
