package Doubly_LinkedList;

public class doublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayrandom(Node random){ //we have to print starting to end
        Node temp = random;
        // Move this temp backwards to the head
        while(temp.prev!=null){
            temp = temp.prev;
        }
        // now temp is at head
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insetionAtHead(Node head, int x){
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    
    public static void insetionAtTail(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void main(String[] args) {
        //4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next =  null;
        // display(a);
        // displayrev(e);
        // displayrandom(c);
        // Node newHead = insetionAtHead(a, 35);
        // display(newHead);
        insetionAtTail(a, 90);
        display(a);
    }
}
