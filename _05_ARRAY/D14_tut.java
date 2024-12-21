package _05_ARRAY;

import java.util.Scanner;

public class D14_tut {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Row:");
        int r=sc.nextInt();
        System.out.print("Enter the size of colummn:");
        int c=sc.nextInt();
        System.out.println("Enter Array Element:");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        printArray(arr);
    }
}
