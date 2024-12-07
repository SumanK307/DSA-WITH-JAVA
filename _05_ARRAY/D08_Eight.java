package _05_ARRAY;

import java.util.Scanner;

public class D08_Eight {
    static void printArray(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //**********************(Q.1)By using Extra space Rotate Array***********************/
    static int[] Rotate(int[] arr , int k,int n){       //Array Function
        k=k%n;
        int[] ans = new int[n];  
        int j=0;
        for (int i = n-k; i < n; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];            
        }
        return ans;
    }

    //**********************(Q.1)By using Extra space Rotate Array***********************/
    static int[] Rotate(int[] arr , int k,int n){       //Array Function
        k=k%n;
        int[] ans = new int[n];  
        int j=0;

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
        printArray(arr,n);
        System.out.print("Enter the index number which step do you want to rotate:");
        int k=sc.nextInt();
        int[] ans=Rotate(arr,k,n);           //Q.1


    }
}
