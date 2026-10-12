import java.util.*;
class Main {
    static class CircularQueue{
        int[] arr;
        int front;
        int rear;
        int size;
        int capacity;
        CircularQueue(int capacity){
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }
        void enqueue(int value){
            if(size==capacity){
                System.out.println("Queue is Full!");
                return;
            }
            rear = (rear+1)%capacity;
            arr[rear] = value;
            size++;
            System.out.println("Inserted " + value);
        }
        void dequeue(){
            if(size==0){
                System.out.println("Queue is already empty!");
                return;
            }
            System.out.println("Remove from first");
            front = (front+1)%capacity;
            size--;
        }

        void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            System.out.println("Queue: ");
            for(int i=0; i<size;i++){
                int index = (front+i)%capacity;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        // Implementation of Circular Queue
        CircularQueue cq = new CircularQueue(5);
        
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        cq.dequeue();
        cq.display();
        
        
    }
}
