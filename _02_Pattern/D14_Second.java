package _02_Pattern;
import java.util.Scanner;

public class D14_Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
