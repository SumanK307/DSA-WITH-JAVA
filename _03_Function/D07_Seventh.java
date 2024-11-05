package _03_Function;

import java.util.Scanner;

public class D07_Seventh {
    public static void compare(char c1 , char c2) {
        if ((int) c1 > (int) c2)
            System.out.println("Largest character from " + c1 + " and " + c2 + " is= " + c1);
        else if ((int) c2 > (int) c1)
            System.out.println("Largest character from " + c1 + " and " + c2 + " is= " + c2);
        else
            System.out.println("Both the characters " + c1 + " and " + c2 + " are same and value is= " + c1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c1 = 'A';
        char c2 = 'a';
        compare(c1, c2);
    }
}
