package src.ArraysAndHashing.subarraysumdivbyk;

public class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int result = 0;
        int len = nums.length;

        for(int i=0;i<len;i++){
            long sum =0;
            for(int j=i;j<len;j++){
                sum+=nums[j];
                if(sum%k==0)result++;
            }
        }

        return result ;

    }
}