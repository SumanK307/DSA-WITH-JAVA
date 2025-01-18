package _07_STACK;
import java.util.*;

public class D19_tut5 {
    public static void main(String[] args) {
        String postfix = "745*+20+-";
        System.out.println("prefix is:" + postfix);
        Stack<String> val = new Stack<>();
        for (int i = 0; i < postfix.length(); i++){ 
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            } 
            else {
                String v2 = val.pop();
                String v1 = val.pop();
                String t = ch + v1 + v2;
                val.push(t);
            }
    }
    String prefix = val.pop();
        System.out.println("prefix:"+prefix);
    }
}
