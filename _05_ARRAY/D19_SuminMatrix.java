package _05_ARRAY;

import java.util.Scanner;

public class D19_SuminMatrix {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findPrefixSum(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                arr[i][j] += arr[i-1][j];
            }
        }
    }
        static int findSum(int[][] arr,int l1, int r1,int l2, int r2){
            int ans=0 ,sum=0 , up=0 ,left=0 , leftUp=0;
            findPrefixSum(arr);
            sum=arr[l2][r2];
            if(r1 >= 1){
                left = arr[l2][r1-1];
            }
            if(l1 >= 1){
                up=arr[l1-1][r2];
            }
            if(r1 >= 1 && l1 >= 1){
                leftUp = arr[l1-1][r1-1];
            }
            ans= sum-up-left+leftUp;
            return ans;
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Row:");
        int r = sc.nextInt();
        System.out.print("Enter the size of colummn:");
        int c = sc.nextInt();
        System.out.println("Enter Array Element:");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Ractangle Sum:"+findSum(arr,l1,r1,l2,r2));
    }
}
