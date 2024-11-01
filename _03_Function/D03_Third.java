package _03_Function;
import java.util.Scanner;

public class D03_Third {
    public static void greaterNo(int a, int b) {
        int total = a;
        for (int i = 2; i <= b; i++) {
            total = total * a;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNo(a, b);

    }
}
