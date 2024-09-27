package _02_Pattern;

import java.util.Scanner;

public class D17_Fivth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (k = i; k > -1; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
