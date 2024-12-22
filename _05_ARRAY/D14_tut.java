package _05_ARRAY;

import java.util.Scanner;

public class D14_tut {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int[][] arr, int i,int j){
        arr[i][j]=arr[i][j]+arr[j][i];
        arr[j][i]=arr[i][j]-arr[j][i];
        arr[i][j]=arr[i][j]-arr[j][i];
    }
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
        System.out.println("Original Array is:");
        printArray(arr);
    }
}
