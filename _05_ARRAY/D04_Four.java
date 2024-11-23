package _05_ARRAY;

import java.util.Scanner;

public class D04_Four {

    // *******************************Sum of two
    // array*****************************//

    public static void sum(int arr1[][], int arr2[][], int rows, int cols) {
        System.out.println("Sum of array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" +");
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
            System.out.println(" =");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    // ****************************************multiplication of two
    // array****************************//

    public static void multiplication(int arr1[][], int arr2[][], int rows, int cols) {
        System.out.println("Multiplication of array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int mul[][] = new int[rows][cols];
                mul[i][j] = 0;
                for (int k = 0; k < rows; k++) {
                    mul[i][j] = mul[i][j] + arr1[i][k] * arr2[k][j];
                }
                System.out.print(" " + mul[i][j]);
            }
        System.out.println();
        }
    }

    // ************************************Transpose of
    // matrix**********************************//

    public static void transpose(int arr1[][], int rows, int cols) {
        System.out.println("transpose of array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + arr1[j][i]);
            }
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
        sum(arr1, arr2, rows, cols);
        multiplication(arr1, arr2, rows, cols);
    }
}
