package _05_ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class D03_Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO:");
     int n = sc.nextInt();
     int[] arr = new int[5];
     // int[] arr_2 =arr;  //Copy array and locate same memory of arr
    // arr_2[1]=23;       // arr_2 and arr both have 23 at index 1
    // int[] arr_2 =arr.clone();  //Copy array and not locate same memory of arr
    // int[] arr_2 =Arrays.copyOf(arr,arr.length);     //Copy array and not locate same memory of arr
    // Arrays.copyOfRange(arr , StartingIndex ,EndingIndex) ;
    System.out.println("Enter Element:");
    for(int i=0; i<n;i++)          //n=arr.length;
    {
        arr[i] = sc.nextInt();
    }
    // Arrays.sort(arr);       //Sort any array
     System.out.println("Print:");
     for(int i=0 ; i<n ; i++)
     {
        System.out.println(arr[i]);
     }
     Arrays.sort(arr);
     /*************************For Each loop */
   //   for(int arrs :arr){
   //    System.out.print(arrs);
   //   }
    }
}
