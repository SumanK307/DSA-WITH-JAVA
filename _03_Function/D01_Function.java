package _03_Function;

import java.util.Scanner;

public class D01_Function {
    public static int calculateSum(int a, int b) {
        //int sum = a + b;
        //return sum;
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum of 2 numbers is:" + sum);
        System.out.println("Sum of 2 numbers is:" + calculateSum(a, b));
    }
}