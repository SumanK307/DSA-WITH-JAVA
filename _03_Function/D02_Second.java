package _03_Function;

import java.util.Scanner;

public class D02_Second {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.print("invalid!");
            return;
        } else if (n == 0) {
            System.out.println("factorial = 1");
            return;
        }
        int factorial = 1, i;
        for (i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
