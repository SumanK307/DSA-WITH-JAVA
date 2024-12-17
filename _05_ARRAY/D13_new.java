package _05_ARRAY;

import java.util.Scanner;

public class D13_new {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("Enter Array element:");
        for(int i=1;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array:");
        printArray(arr,n);
        int[] pre = PrefixSum(arr, n); 
        System.out.print("Sum of element in Array:");
        printArray(pre,n);
    }
}
