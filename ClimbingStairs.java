public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2){return n;}
        int[] stair = new int[n];
        stair[0] = 1;
        stair[1] = 2;
        for(int i = 2; i < n; i++){
            stair[i] = stair[i-1] + stair[i-2];
        }
        return stair[n-1];
    }


    public static void main(String args[]){
    	ClimbingStairs s = new ClimbingStairs();

    	System.out.println(s.climbStairs(10));
    }
}

