package Stacks;

import java.util.Stack;

public class displayStack {
    public static void displayRec(Stack<Integer> s){
        s.push(6);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayRec(st);
        System.out.println(st);
    }
}
