package src.heaps.laststoneweight;

import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->o2-o1);
        for(int stone :stones){
            pq.offer(stone);
        }

        while(!pq.isEmpty() && pq.size()>=2){
            int first = pq.poll();
            int second = pq.poll();
            if(first!=second){
                pq.add(first-second);
            }
        }
     return !pq.isEmpty() ? pq.poll() : 0;
    }
}
