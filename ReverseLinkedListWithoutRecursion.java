class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}



class Main {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
   

    static Node reverseLL(Node head){
        Node prev = null;
        Node temp = head;
        while(temp!=null && temp.next!=null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }


    
    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Node a = new Node(100);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        
        Node revHead = reverseLL(a);
        display(revHead);

       
        
    }
}


