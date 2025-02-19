package src;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        ContainsDuplicates obj = new ContainsDuplicates();
        System.out.println(obj.containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {
        //extra space of O(N) for storing elements
        HashSet<Integer> set = new HashSet<>();
        //Time complexity of O(N) for iterating over the nums array
        for(int i:nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
      return false;
    }


}
