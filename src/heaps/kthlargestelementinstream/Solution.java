package src.heaps.kthlargestelementinstream;

import java.util.PriorityQueue;

public class Solution {
    PriorityQueue<Integer> pq;
    int size =0;
    public void KthLargest(int k, int[] nums) {
            this.pq = new PriorityQueue<>(k);
            size=k;
            for(int i=0;i<nums.length;i++){
                pq.offer(nums[i]);
                if(i>k)pq.poll();
            }
    }

    public int add(int val) {
       pq.offer(val);
       if(pq.size()>size-1)pq.poll();
       return pq.peek();
    }
}
