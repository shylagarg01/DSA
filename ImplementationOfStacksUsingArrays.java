class Main {
    static class Stack{
        int[] arr;
        int top;
        Stack(int size){
            arr = new int[size];
            top = -1;
        }
        void push(int val){
            if(top == arr.length-1){
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = val;
        }
        int pop(){
            if(top==-1){
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[top--];
            
         }

        int peek(){
            if(top==-1){
                return -1;
            }
            return arr[top];
        }

        void display(){
            for(int i=top; i>=0; i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    

    
    
    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        int ans = st.pop();

        System.out.println(ans);

        st.display();

        int ansss = st.peek();
        System.out.println(ansss);

        st.display();
        
    }
}
