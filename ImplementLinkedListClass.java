
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linkedlist{
    Node head;
    Node tail;

    void display(){
        if(head==null){
            return;
        }
        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    void insertAtBeg(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    void deleteAtBeg(){
        if(head==null){
            System.out.println("Cant delete");
            return;
        }
        if(head==tail){
            head = tail = null;
            return;
        }
        head = head.next;
        
    }
    int size(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("Cant delete");
            return;
        }
        if(head==tail){
            head = tail = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        
    }

    void search(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data == val){
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found ");
        return;
    }

    void insertAtIndex(int index, int val){
        Node newNode = new Node(val);
        if(index<0 || index> size()){
            System.out.println("Index out of bound");
            return;
        }
        if(index==0){
            insertAtBeg(val);
            return;
        }
        if(index == size()){
            insertAtEnd(val);
            return;
        }
        
        
        
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void get(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void deleteAtIndex(int index){
        if(index<0 || index>size()-1){
            System.out.println("Index out of bound");
            return;
        }
        
        if(index == 0){
            deleteAtBeg();
            return;
        }
        if(index==size()-1){
            deleteAtEnd();
            return;
        }

        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
            
        }
        temp.next = temp.next.next;
    }
}

class Main {
    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Linkedlist ll = new Linkedlist();
        ll.deleteAtBeg();
        ll.insertAtEnd(10);
        ll.display();
        ll.deleteAtBeg();
        ll.insertAtEnd(20);
        ll.display();
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.display();
        ll.insertAtBeg(100);
        ll.display();
        ll.deleteAtBeg();
        ll.display();
        int size = ll.size();
        System.out.println(size);
        ll.deleteAtEnd();
        ll.display();
        int sizee = ll.size();
        System.out.println(sizee);
        ll.search(100);
        ll.search(20);
        ll.search(10);
        ll.insertAtIndex(2,100);
        ll.display();
        ll.insertAtIndex(0,78);
        ll.display();
        ll.insertAtIndex(5,0);
        ll.display();
        ll.insertAtIndex(67,90);
        ll.display();
        ll.get(2);
        ll.get(4);
        ll.display();
        ll.deleteAtIndex(0);
        ll.display();
        ll.deleteAtIndex(3);
        ll.display();
        ll.deleteAtIndex(4);
        ll.display();
        ll.deleteAtIndex(3);
        ll.display();
    
        
            
        
        
    }
}


