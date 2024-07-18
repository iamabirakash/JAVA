package LinkedList;

public class nthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
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
    
    // In One Traversal
    public static Node nthNode2(Node head, int idx){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // Deleting nth Node From End
    public static Node deleteNthNode(Node head, int idx){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
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

        // Node q = nthNode(a,2); // a -> head
        // Node q = nthNode2(a,2); // a -> head
        // System.out.println(q.data);

        display(a);
        a = deleteNthNode(a, 6);
        System.out.println("");
        display(a);
    }
}
