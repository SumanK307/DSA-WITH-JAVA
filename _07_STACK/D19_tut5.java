package _07_STACK;

public class D19_tut5 {
    public static void main(String[] args) {
        String postfix = "745*+20+-";
        System.out.println("prefix is:" + postfix);
        Stack<String> val = new Stack<>();
        for (int i = 0; i < postfix.length(); i++){ 
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
    }
}
