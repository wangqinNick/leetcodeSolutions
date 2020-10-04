package solutions.q01;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int firstIndex = 0; firstIndex < nums.length; firstIndex ++){
            for(int secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex ++){
                if (nums[firstIndex] + nums[secondIndex] == target) {
                    return new int[] {firstIndex, secondIndex};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //nums = [2,7,11,15], target = 9
        int [] nums = {2, 11, 7, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
