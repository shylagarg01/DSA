
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
    

    static boolean search(Node head, int target){
        Node temp = head;
        while(temp!=null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
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
       

        boolean ans = search(a, 40);
        if(ans){
            System.out.println("Found!");
        } else{
            System.out.println("Not Found!");
        }
        
        
    }
}















