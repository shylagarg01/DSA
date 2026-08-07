import java.util.*;
class Main {
    public static int solve(int[] cost, int index){
        if(index>=cost.length){
            return 0;
        }
        return cost[index] + Math.min(solve(cost, index+1), solve(cost, index+2));
    }
    public static int minCost(int[] cost){
        return Math.min(solve(cost, 0), solve(cost, 1));
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n = sc.nextInt();
        int[] cost = new int[n];
        System.out.println("Enter cost: ");
        for(int i=0; i<n; i++){
            cost[i] = sc.nextInt();
        }
        System.out.println("Minimum Cost: " + minCost(cost));
    }
}
