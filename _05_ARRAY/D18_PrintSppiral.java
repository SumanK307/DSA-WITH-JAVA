package _05_ARRAY;

import java.util.Scanner;

public class D18_PrintSppiral {
   // Print in spiral order
    static int[][] SpiralOrder(int[][] arr2 , int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;
        int temp = 1;
        while (totalElement < r * c) {
            // toprow --> leftcol to rightcol
            for (int i = leftCol; i <= rightCol; i++) {
                arr2[topRow][i]=temp;
                totalElement++;
                temp++;
            }
            topRow++;
            // rightcol --> toprow to bottomrow
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                arr2[i][rightCol]=temp;
                totalElement++;
                temp++;
            }
            rightCol--;
            // bottomrow --> rightcol to leftcol
            for (int i = rightCol; i >= leftCol && totalElement < r * c; i--) {
                arr2[bottomRow][i]=temp;
                totalElement++;
                temp++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                arr2[i][leftCol]=temp;
                totalElement++;
                temp++;
            }
            leftCol++;
        }
        return arr2;
    }      
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Row:");
        int r = sc.nextInt();
        System.out.print("Enter the size of colummn:");
        int c = sc.nextInt();
        System.out.println("Enter Array Element:");
        int[][] arr = new int[r][c];
        int[][] arr2 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        printArray(arr);
        SpiralOrder(arr2 , r, c);
        printArray(arr2);
    }
}
