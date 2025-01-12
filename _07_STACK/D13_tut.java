package _07_STACK;

import java.util.*;

public class D13_tut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "8-4+6*4/8"; 
        
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57)  val.push(ascii-48);
            else if(op.size()==0 || ch == '(' || op.peek() == '(')   op.push(ch);
            else if(ch == ')'){
                while(op.peek()!='('){
                    int v2 =val.pop();
                    int v1 =val.pop();
                    if(op.peek() == '+')    val.push(v1+v2);
                    if(op.peek() == '-')    val.push(v1-v2);
                    if(op.peek() == '*')    val.push(v1*v2);
                    if(op.peek() == '/')    val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            }
            else{
                
    }
}
