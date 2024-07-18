package LinkedList;

public class nthNodeFromEnd {
    public static Node nthNode(Node head, int idx){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - idx + 1; //mth node from start
        temp = head;
        for(int i=1; i<=m-1; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a  = new Node(100);
        Node b  = new Node(101);
        Node c  = new Node(102);
        Node d  = new Node(103);
        Node e  = new Node(104);
        Node f  = new Node(105);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        //100->101->102->103->104->105
        Node q = nthNode(a,2); // a -> head
        System.out.println(q.data);
    }
}
