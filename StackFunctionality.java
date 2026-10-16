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




