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
    }    
}
