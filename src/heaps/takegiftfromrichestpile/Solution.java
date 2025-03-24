package src.heaps.takegiftfromrichestpile;

import java.util.PriorityQueue;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for(int i :gifts){
            priorityQueue.offer(i);
        }
        while (k-->0){
            int temp =priorityQueue.poll();
            priorityQueue.offer((int)Math.floor(Math.sqrt(temp)));
        }

        long result =0;
        while(!priorityQueue.isEmpty()){
            result+=priorityQueue.poll();
        }
        return result;
    }
}
