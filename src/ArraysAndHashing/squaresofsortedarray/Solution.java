package src.ArraysAndHashing.squaresofsortedarray;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] sortedSquares(int[] nums) {
      for(int i=0;i< nums.length;i++)nums[i]*=nums[i];
      Arrays.sort(nums);
      return nums;
    }
}
