package _02_Pattern;

import java.util.Scanner;

public class D13_First {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = sc.nextInt();
    int i,j;
    //Q.1 squre
     for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.print(" *");
        }
        System.out.print("\n");
    }
    }
}
