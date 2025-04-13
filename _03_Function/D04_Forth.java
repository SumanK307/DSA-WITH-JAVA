package _03_Function;

import java.util.Scanner;

public class D04_Forth {
    static void Details(int marks) {
        if (marks < 35) {
            System.out.println("Fail ho");
        } 
        else if (marks >= 35 && marks < 65) {
            System.out.println("B grade.");
        } 
        else if (marks >= 65 && marks < 75) {
            System.out.println("A grade");
        } 
        else if (marks >= 75 && marks < 100) {
            System.out.println("O grade!");
        } 
        else {
            System.out.println("Invalid marks entered.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int marks = sc.nextInt();
        Details(marks);
    }
}
