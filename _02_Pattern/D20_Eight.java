package _02_Pattern;

import java.util.Scanner;

public class D20_Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number value:");
        int n = sc.nextInt();
        int i, j, k;
        k = 0;
        for (i = 1; i < n; i++) {
            for (j = 1; j < i; j++) {
                k++;
                if (k % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.print("\n");
        }
    }
}
