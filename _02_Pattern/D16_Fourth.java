package _02_Pattern;

import java.util.Scanner;

public class D16_Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of :");
        int n = sc.nextInt();
        int i, j,k;
        for (i = 0; i<n; i++) {
            for (j = i; j>0; j--) {
                System.out.print(" ");
            }
            for (k = i; k < n; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
