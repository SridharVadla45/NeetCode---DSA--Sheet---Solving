package src.heaps.kthlargestelementinarr;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int i:nums) pq.offer(i);
        int result = nums[0];
        for(int i=0;i<k;i++){
          result=pq.poll();
        }
        return result;
    }

    private int usingSort(int [] nums,int k ){
        Arrays.sort(nums);
        return nums[k-1];
    }
}
