package _07_STACK;

import java.util.*;

public class D17_tut3 {
    public static void main(String[] args) {
        // **************Evaluation of prefix**************//

        String prefix = "-+7*45+20";
        Stack<Integer> val = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else {
                int v1 = val.pop();
                int v2 = val.pop();
                if (ch == '+')
                    val.push(v1 + v2);
                if (ch == '-')
                    val.push(v1 - v2);
                if (ch == '*')
                    val.push(v1 * v2);
                if (ch == '/')
                    val.push(v1 / v2);
            }
        }
        int ans = val.pop();
        System.out.println(ans);
    }
}
