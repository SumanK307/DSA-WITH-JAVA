package _03_Function;

import java.util.Scanner;

public class D08_Eight {
    static void Fibonacci(int n)
    {
        int num1= 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        Fibonacci(n);
    }
}
