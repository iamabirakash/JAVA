package Stacks;

import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // 0 -> 48 and 9 -> 57
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            String o = val.pop();
            String t = v1 + v2 + o;
            val.push(t);
        }
        String postfix = val.pop();
        System.out.println(postfix);
    }
}
