package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.print("Enter the no. of element you want to insert :- ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the elemet " + i + " :- ");
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        // Reverse Order
        Stack<Integer> gt = new Stack<>();
        while (st.size()>0) {
            gt.push(st.pop());
        }
        Stack<Integer> rt = new Stack<>();
        while (gt.size()>0) {
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
