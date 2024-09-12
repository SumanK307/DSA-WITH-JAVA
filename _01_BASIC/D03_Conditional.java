package _01_BASIC;
import java.util.*;
public class D03_Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
            if(a>b)
            {
                System.out.println(a+" is greater as compare to "+b);
            }
            else
            {
                System.out.println(b+" is greater as compare to "+a);
            }
        }
}
