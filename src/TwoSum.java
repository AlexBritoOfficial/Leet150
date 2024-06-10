import java.util.HashMap;
import java.util.jar.JarEntry;

public class TwoSum {
    TwoSum(){
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> memo = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {

            if(!(nums[i] < target) || !(memo.containsKey(nums[i]))){
                int difference = target - nums[i];
                memo.put(difference,i);
            }

            else {
                return new int[]{memo.get(nums[i]), i};
            }

        }
        return new int [1];
    }


    public static void main(String[] args) {

        int[] array = {2,7,11,15};
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(array, 9);


    }
}
