package Stacks;

public class LLImplementationOfStacks {
    public static class Node{ // User Defined Data Type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack { //User Defined Data Structure
        private Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        void displayRec(Node head){
            if(head==null) return;
            displayRec(head.next);
            System.out.print(head.val + " ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){ //getter
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(3);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(2);
        st.display();
        st.push(1);
        st.display();
        st.push(0);
    }
}
