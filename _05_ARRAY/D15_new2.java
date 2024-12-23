package _05_ARRAY;

import java.util.Scanner;

public class D15_new2 {
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
    static void reverseArray(int[] arr){ 
        int i=0,j=arr.length-1;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
    }
    static void Transpose(int[][] arr,int r,int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) { 
                if(i!=j){
                    swap(arr, i, j);
                    }
                }
            }
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
        System.out.println("Original Array:");
        printArray(arr);
        int[][] tran= Transpose(arr, r, c);                 
        System.out.println("After 90 degree rotation array is:");
        Rotate90(arr, r);
        printArray(arr);
}
