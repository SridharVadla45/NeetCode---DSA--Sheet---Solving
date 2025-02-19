package src;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        int [] ans = {-1,-1};
        for(int i=0 ;i<nums.length;i++){
            int temp = target-nums[i];
            if(hashMap.containsKey(temp)) {
                ans[0]=hashMap.get(temp);
                ans[1]=i;
                return ans;
            }
            hashMap.put(nums[i],i);
        }
        return ans;
    }
}
