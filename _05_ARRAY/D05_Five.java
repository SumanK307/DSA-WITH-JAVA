package _05_ARRAY;
import java.util.*;

public class D05_Five {

    //**********************Binary Search**********************/
    static int search(int[] arr, int target){
        int start = 0;
        int end   = arr.length-1; 
        while(start <= end){
            // find mid
            int mid = start + (end - start)/2; 
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]> target)
                end = mid-1;
                else
                start = mid +1;
        }
        return -1;
    }

    //********************Find First Occurance in the array********************/
    static int FirstOccu(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else if(target < arr[mid]){
                end=mid-1;
            }
        } 
        return ans;
    }
    //********************Find First Occurance in the array********************/
     static int LastOccu(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else if(target < arr[mid]){
                end=mid-1;
            }
        } 
        return ans;
    }
    static int PeakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<end){
            mid = start + (end - start)/2;
           if(arr[mid] < arr[mid+1]){
               start=mid+1;
           }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print(" Enter " + n + " Elements: "); 
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.print(" Enter target Element which you want to Find: ");
        int target = sc.nextInt();
        System.out.println(target + " Found at Index: " + search(arr, target));
        int f=FirstOccu(arr, target);
        System.out.println(target + " First Accurance at Index: " + f);  
    }
}
