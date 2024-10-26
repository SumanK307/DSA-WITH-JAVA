package _02_Pattern; 

import java.util.*;

public class D18_Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int i, j, k;
        for(i=n;i>=1;i--)
    {
        for(j=1;j<i;j++)
        {
            System.out.print(j);
        }
        System.out.print("\n");
    }
    }
}