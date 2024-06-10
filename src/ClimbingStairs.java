import java.util.HashMap;

public class ClimbingStairs {


    public int climbStairs(int n){
        return climbStairsHelper(n, new HashMap<Integer, Integer>());
    }
    public int climbStairsHelper(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if(!memo.containsKey(n)){
            memo.put(n,climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2 , memo));
        }

        return memo.get(n);
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(44));
    }
}
