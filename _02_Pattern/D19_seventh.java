package _02_Pattern;
import java.util.Scanner;

public class D19_seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of :");
        int n = sc.nextInt();
        int i, j, k;
        k = 0;
        for (i = 1; i < n; i++) {
            for (j = 1; j < i; j++) {
                k++;
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }
}
