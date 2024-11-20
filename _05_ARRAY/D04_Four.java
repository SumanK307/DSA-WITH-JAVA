package _05_ARRAY;

import java.util.Scanner;

public class D04_Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter NO:");
        // int n = sc.nextInt();
        // int[] arr = new int[5];
        System.out.print("Enter row no:");
        int rows = sc.nextInt();
        System.out.print("Enter column no:");
        int cols = sc.nextInt();
        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];
        System.out.println("Entre first array element:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entre Second array element:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
    }
}
