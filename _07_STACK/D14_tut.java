package _07_STACK;
import java.util.*;

public class D14_tut {
    public static void main(String[] args) {
        //*****************Infix to prefix*****************//
//         String infix = "8-(4+6)*4/8"; 
//         System.out.println(infix);
//         Stack<String> val = new Stack<>();
//         Stack<Character> op = new Stack<>();
//         for (int i = 0; i < infix.length(); i++) {
//             char ch = infix.charAt(i);
//             int ascii = (int)ch;
//             if(ascii >= 48 && ascii <= 57){  String s = "" + ch;
//             val.push(s);
//         }
//             else if(op.size()==0 || ch == '(' || op.peek() == '(')   op.push(ch);
//             else if(ch == ')'){
//                 while(op.peek()!='('){
//                     String v2 =val.pop();
//                     String v1 =val.pop();
//                     char o = op.pop();
//                     String t = o + v1 + v2;
//                     val.push(t);
//                 }
//                 op.pop();
//             }
//             else{
//                 if(ch == '+' || ch == '-'){
//                     String v2 =val.pop();
//                     String v1 =val.pop();
//                     char o = op.pop();
//                     String t = o + v1 + v2;
//                     val.push(t);
//                     op.push(ch);
//                 }
    }
}
