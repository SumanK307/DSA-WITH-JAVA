package _05_ARRAY;

import java.util.Scanner;

public class D12_1NegSort {
    static void printArray(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr, int i,int j){
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j]; 
        arr[i] = arr[i]-arr[j];
}
    //************************* (Q..1) sort Arr̥ay of -ve containing element square*************************/
    static int[] sortSquares(int[] arr,int n){
        int left=0,right=n-1;
        int[] ans = new int [n];
        int k=0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
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
        // int[] ans = sortSquares(arr, n);              //Q.1
        // reverse(ans, 0, n-1);
        // printArray(ans, n);
    }
}
