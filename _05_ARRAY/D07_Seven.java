package _05_ARRAY;

import java.util.Scanner;

public class D07_Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        System.out.print("Enter Array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}
