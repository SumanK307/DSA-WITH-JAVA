package _05_ARRAY;

import java.util.Scanner;

public class D06_Six {
    static int SqureRoot(int n){
        int s=0;
        int e=n;
        int mid;
        int ans=-1;
        while(s <= e){
            mid = s+(e-s)/2;
            if(n*n == n){
                return mid;
            }
            else if(n*n < n){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");  
        int n = sc.nextInt();
        System.out.println("Squre root of "+n+" is :"+SqureRoot(n));
    }
}
