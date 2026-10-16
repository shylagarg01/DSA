
import java.util.*;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try clicking the Run button.");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(20);
        System.out.println(dq);
        dq.addFirst(10);
        System.out.println(dq);
        dq.addLast(30);
        System.out.println(dq);
        dq.addLast(40);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
 
    }
}

