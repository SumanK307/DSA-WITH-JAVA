package _01_BASIC;
import java.util.Scanner;

public class D09_FoorLoor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
        System.out.println("Outer: " + i); // Executes 2 times
        for (int j = 1; j <= 3; j++) {
          System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        }
      } 
}
}