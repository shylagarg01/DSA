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
    
    static int countNode(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count+=1;
            temp = temp.next;
        }
        return count;
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
       
        int count = countNode(a);
        System.out.println(count);

        
    }
}
