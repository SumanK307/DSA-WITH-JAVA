package _05_ARRAY;

import java.util.Scanner;

public class D12_2PrefixS {
    static void printArray(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array element(must contain -ve element for Q.1):");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array:");
        printArray(arr,n);
        int[] pre=PrefixSum(arr, n);                    //Q.2
        printArray(pre, n);
    }    
}
