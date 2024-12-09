package _05_ARRAY;

import java.util.Scanner;

public class D09_Nine {
    static int[] FreQuencyArray(int[] arr,int n){
        int[] freq =new int[100001];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    static void printArray(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Element:");
        printArray(arr,n);
        System.out.print("Enter no of Query:");
        int q=sc.nextInt();
        int[] ans=FreQuencyArray(arr,n);
        while (q>0) {
            System.out.print("Enter no to be search:"); 
            int x=sc.nextInt();
            if(ans[x]>0){
                System.out.println("YES");
            }        
            else{
                System.out.println("NO");
            }
            q--;
        } 
    }    
}
