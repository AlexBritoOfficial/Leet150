import java.util.HashMap;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        return coinChangeHelper(coins, amount, new HashMap<>());
    }

    public int coinChangeHelper(int[] coins, int amount, HashMap<Integer, Integer> memo) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        if(memo.containsKey(amount)){
            return memo.get(amount);
        }

        int minCoins = -1;
        for (int i = 0; i < coins.length; i++) {

            int subCoins = coinChangeHelper(coins, amount - coins[i], memo);

            if(subCoins != -1){
                int numCoins = subCoins + 1;
                if(numCoins < minCoins || minCoins == -1){
                    minCoins = numCoins;
                }
            }
        }

        memo.put(amount, minCoins);
        return minCoins;
    }

    public static void main(String[] args) {

    }

}
