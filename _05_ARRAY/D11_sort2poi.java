package _05_ARRAY;

import java.util.Scanner;

public class D11_sort2poi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array element(only contain o and 1):");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array:");
        printArray(arr,n);
    }
}
