import java.util.ArrayList;
import java.util.Arrays;

public class Arithmetic {
    class Solution {
        public ArrayList<Integer> numberGame(int[] nums) {
            Arrays.sort(nums);
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < nums.length; i+=2) {
                int a = nums[i];
                int b = nums[i+1];
                arr.add(b);
                arr.add(a);
            }

            return arr;
        }
    }
}
