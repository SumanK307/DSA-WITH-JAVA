package _01_BASIC;
import java.util.*;
public class Take_input {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);  // take input from user
    String name1 = sc.next();
    String name2 = sc.nextLine();
    System.out.println(name2);
    System.out.println(name1);
    System.out.println("sum"); //hello
    int a = sc.nextInt();
    float b = sc.nextFloat();
    float sum = a+b;
    System.out.println(sum); 
    System.out.println(name1+name2); 
   }
}

