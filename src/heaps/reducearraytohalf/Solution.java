package src.heaps.reducearraytohalf;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i: arr){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hashMap.get(b)-hashMap.get(a));
        for(int i:hashMap.keySet()){
            pq.offer(i);
        }

        int len =0;
        int count=0;
        while (!pq.isEmpty()){
            len+=hashMap.get(pq.poll());
            count++;
            if(len>= arr.length/2) return count;
        }
        return count;
    }
}
