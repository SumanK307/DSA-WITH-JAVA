package _05_ARRAY;

import java.util.Scanner;

public class D11_sort2poi {
    static void printArray(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //************************(Q.1.1)sort 0 and 1 normal process*************************/
    static int[] sort(int[] arr,int n){
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        for (int i = 0; i <n; i++) {
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }            
        }
        return arr;
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
        System.out.print("Original Array is:");
        printArray(arr,n);
        System.out.print("sort normal process:");
        sort(arr,n);
        printArray(arr,n);
    }
}
