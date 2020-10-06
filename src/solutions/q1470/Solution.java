package solutions.q1470;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] newArray = new int [nums.length];
        int j = 0;
        for(int i = 0; i < nums.length /2 ; i= i + 1){
            newArray[j] = nums[i];
            newArray[j+1] = nums[i + n];
            j = j + 2;
        }
        return newArray;
    }
}
