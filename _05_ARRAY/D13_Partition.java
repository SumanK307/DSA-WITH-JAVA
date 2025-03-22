package _05_ARRAY;

import java.util.*;

public class D13_Partition {
    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean PartitionOfArray(int[] arr, int[] pre, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] * 2 == pre[n - 1]) {
                System.out.println("Partition Hoga");
                return true;
            }
        }
        return false;
    }

    static int[] PrefixSum(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array is:");
        printArray(arr, n);
        System.out.print("Sum of element in Array:");
        int[] pre = PrefixSum(arr, n);
        printArray(pre, n);
        PartitionOfArray(arr, pre, n);
    }
}
