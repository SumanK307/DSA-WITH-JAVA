package _05_ARRAY;

import java.util.Scanner;

public class D16_Passcal {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of Row for Pascal Question:");
        int n = sc.nextInt();
        int[][] ans = Pascal(n);
        printArray(ans);
    }
}