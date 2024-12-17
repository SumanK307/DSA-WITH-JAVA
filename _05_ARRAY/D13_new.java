package _05_ARRAY;

import java.util.Scanner;

public class D13_new {
    static int[] PrefixSum(int[] arr,int n){
        for (int i = 2; i <= n; i++) {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    static void printArray(int[] arr ,int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
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
        System.out.print("Enter no of Query:");
        int q=sc.nextInt();
        while (q-->0){
            System.out.print("Enter the first index:"); 
            int x=sc.nextInt();
            System.out.print("Enter the second index:"); 
            int y=sc.nextInt();
            int sum = pre[y] - pre[x-1];
            System.out.println("Sum b/w two index:"+sum);
            
        }
    }
}
