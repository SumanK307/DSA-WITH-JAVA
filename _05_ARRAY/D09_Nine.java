package _05_ARRAY;

import java.util.Scanner;

public class D09_Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Element:");
        printArray(arr,n);
        System.out.print("Enter no of Query:");
        int q=sc.nextInt();
        int[] ans=FreQuencyArray(arr,n);
        while (q>0) {
            System.out.print("Enter no to be search:"); 
            int x=sc.nextInt();
    }    
}
