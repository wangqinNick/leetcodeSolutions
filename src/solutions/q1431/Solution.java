package solutions.q1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List <Boolean> kidsWithCandies = new ArrayList<>();
        for(int i = 0; i < candies.length; i++ ){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++ ){
            if(candies[i] + extraCandies >= max){
                kidsWithCandies.add(true);
            }
        }
        return kidsWithCandies;
    }

}
