package solutions.q1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j ++){
                if(nums[i] == nums[j]){
                    sum = sum + 1;
                }
            }
        }
        return sum;
    }
}

class Solution2 {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            int valve=map.getOrDefault(num,0);
            count+=valve;
            map.put(num,valve+1);
        }
        return count;
    }
}