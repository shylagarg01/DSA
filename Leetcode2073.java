class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // person 0: 2 tickets
        // person 1: 3 tickets
        // person 2: 2 tickets

        // here we will use queues

        // q.add(0) --> q.add(1) ---> q.add(2)
        // int person = q.poll()
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }

        int time = 0;
        while(true){
            int person = q.poll();
            tickets[person]--;
            time++;
            if(person==k && tickets[person]==0){
                return time;
            }
            if(tickets[person]>0){
                q.add(person);
            }
        }
    }
}




