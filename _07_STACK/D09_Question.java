package _07_STACK;

import java.util.Scanner;

public class D09_Question {
    public static boolean isBalance(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String:");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
