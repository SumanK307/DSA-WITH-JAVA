package _05_ARRAY;

import java.util.Scanner;

public class D07_Seven {
    static void printArray(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }
//**********************Find two element sum equal to target****************************/
    static int Count(int[] arr,int s){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==s){
                    c++;
                }
            }
        }
        return c;
    }
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
