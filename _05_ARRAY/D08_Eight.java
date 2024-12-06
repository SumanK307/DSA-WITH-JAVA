package _05_ARRAY;

import java.util.Scanner;

public class D08_Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; 
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        System.out.print("Enter Array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr,n);
        System.out.print("Enter the index number which step do you want to rotate:");
        int k=sc.nextInt();
        int[] ans=Rotate(arr,k,n);           //Q.1


    }
}
