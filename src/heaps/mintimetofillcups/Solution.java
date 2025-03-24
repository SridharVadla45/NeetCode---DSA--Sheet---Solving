package src.heaps.mintimetofillcups;

import java.util.PriorityQueue;

public class Solution {
    public int fillCups(int[] amount) {
       int noOfSecs= 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int cups:amount){
            pq.offer(cups);
        }
        while (!pq.isEmpty() && pq.size()>=2){
            int first = pq.poll();
            int second = pq.poll();
            if(first-1>0)pq.offer(first-1);
            if(second-1>0)pq.offer(second-1);
            noOfSecs++;
        }
        return pq.isEmpty() ? noOfSecs : noOfSecs+pq.poll();
    }
}
