package _02_Pattern;

import java.util.Scanner;

public class D15_Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of :");
        int n = sc.nextInt();
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
