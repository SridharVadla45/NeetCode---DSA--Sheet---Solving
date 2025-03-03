package src.ArraysAndHashing;

import java.util.ArrayList;

public class MinimumCostToRemove {
    public int minCost(int[] nums) {
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();;
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
            if(ans.size()==3 || i==nums.length-1) {
                int min =Integer.MAX_VALUE;
                Object a=-1;
                Object b=-1;
                for (int p = 0; p < ans.size(); p++) {
                    for (int q = p + 1; q < ans.size(); q++) {
                        if(min> Math.max(ans.get(p), ans.get(q))){
                            min= Math.max(ans.get(p), ans.get(q));
                            a=ans.get(p);
                            b=ans.get(q);
                        }
                    }
                }
                ans.remove(a);
                ans.remove(b);
                result += min;
            }
        }
        return result;
    }

    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

    }
©leetcode
}
