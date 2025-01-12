package _07_STACK;

import java.util.Scanner;

public class D13_tut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "8-4+6*4/8"; 
        
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
    }
}
