package _05_ARRAY;

import java.util.Scanner;

public class D11_3Sort {
    static void printArray(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i,int j){
        arr[i] = arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    static void sortEvenOdd(int[] arr,int n){  
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }

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
        sortEvenOdd(arr,n);
        printArray(arr,n);
    }    
}
