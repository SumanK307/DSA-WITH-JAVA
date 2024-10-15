package _03_Function;

import java.util.Scanner;

public class D06_Sixth {
    void test() {
        int n = 5732, result = 0;
        do {
            result *= 10;
            int digit = n % 10;
            result += digit;
            n = n / 10;
        } while (n > 0);
        System.out.println("Output=" + result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();

    }
}
