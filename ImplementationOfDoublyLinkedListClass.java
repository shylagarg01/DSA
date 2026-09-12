class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class DLL{
    Node head;
    Node tail;

    void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        tail = temp;
        newNode.prev = tail;
        tail.next = newNode;
        tail = tail.next;
    }

    void deleteAtHead(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
        return;
    }

    void deleteAtTail(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayRev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    int size(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtK(int k, int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail = newNode;
            return;
        }
        if(k<0 || k>=size()){
            System.out.println("Invalid ");
            return;
        }
        if(k==0){
            insertAtHead(data);
            return;
        }
        if(k==size()-1){
            insertAtTail(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<k; i++){
            temp = temp.next;
        }
        Node next = temp.next;
        newNode.next = next;
        next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        
    }

    void deleteAtK(int k){
        if(head==null){
            System.out.println("Cannot delete ");
            return;
        }
        if(k<0 || k>=size()){
            System.out.println("Invalid");
            return;
        }
        if(k==0){
            deleteAtHead();
            return;
        }
        if(k==size()){
            deleteAtTail();
            return;
        }
        Node temp = head;
        for(int i=1; i<k; i++){
            temp = temp.next;
        }
        Node next = temp.next.next;
        temp.next = next;
        next.prev = temp;
       
    }

    
}



class Main {
    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");

        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.display();
        list.displayRev();
        list.insertAtHead(100);
        list.display();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
        int length = list.size();
        System.out.println(length);
        list.insertAtK(5,99);
        list.display();
        list.deleteAtK(2);
        list.display();
        list.deleteAtK(0);
        list.display();
    }
}
