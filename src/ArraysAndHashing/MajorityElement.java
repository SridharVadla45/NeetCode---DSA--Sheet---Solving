package src.ArraysAndHashing;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {

    return bruteSolution(nums);
    }

    private static int bruteSolution(int [] nums){
        int n =nums.length;
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i: nums){
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            if(hashmap.get(i)>n/2) return i;
        }
        return -1;
    }

    private static  int betterSolution(int [] nums){



        return -1;
    }
}
