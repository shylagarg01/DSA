import java.util.*;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try clicking the Run button.");
        String s = "mam";
        Deque<Character> dq = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            dq.addFirst(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while(!dq.isEmpty()){
            result.append(dq.removeFirst());
        }
        if(s.equals(result.toString())){
            System.out.println("Palindrome!");
        } else{
            System.out.println("Not a palindrome");
        }
        
    }
}
