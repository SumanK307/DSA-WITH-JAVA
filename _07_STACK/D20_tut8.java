package _07_STACK;
import java.util.*;
public class D20_tut8 {
    public static void main(String[] args) {
        // *****************Convert prefix to infix*****************//
        String prefix = "-+7*45+27";
        System.out.println("prefix is:" + prefix);
        Stack<String> val = new Stack<>();
        for (int i = prefix.length()-1; i >= 0; i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            } 
            else {
                
    }
}
