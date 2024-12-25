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
    // Pascal triangle of n row 
    static int[][] Pascal(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++){
            ans[i]=new int[i+1];        //this is create colummn
            ans[i][0]=ans[i][i]=1;      //this is inisilais the value of 1st and last index
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of Row for Pascal Question:");
        int n = sc.nextInt();
        int[][] ans = Pascal(n);
        printArray(ans);
    }
}