package _03_Function;
import java.util.Scanner;

public class D05_Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str)+"\n");

    }
}
