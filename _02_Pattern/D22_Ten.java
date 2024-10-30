package _02_Pattern;
import java.util.Scanner;
public class D22_Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of :");
        int N = sc.nextInt();
        int spaces = 2 * N - 1;
        int stars = 0;
        for (int i = 1; i <= 2 * N - 1; i++) {
            if (i <= N) {
                spaces = spaces - 2;
                stars++;
            }
            else {
                spaces = spaces + 2;
                stars--;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j != N) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
}
}