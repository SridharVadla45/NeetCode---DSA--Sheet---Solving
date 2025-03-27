package src.heaps.subseqwithklargestsum;

import java.util.PriorityQueue;

public class Solution {

    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int []> minHeap = new PriorityQueue<>(k,(a,b)->a[0]-b[0]);
        for(int i=0;i< nums.length;i++){
            minHeap.offer(new int []{nums[i],i});
            if(minHeap.size()>k)minHeap.poll();
        }
        PriorityQueue<int []> temp = new PriorityQueue<>(k,(a,b)->a[1]-b[1]);
        while(!minHeap.isEmpty())temp.offer(minHeap.poll());
        int [] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=temp.poll()[0];
        }

      return result;
    }
}
