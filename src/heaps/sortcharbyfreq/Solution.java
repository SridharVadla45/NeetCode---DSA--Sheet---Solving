package src.heaps.sortcharbyfreq;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c :s.toCharArray()){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }else{
                hashMap.put(c,1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.count-a.count);
        for(char c:hashMap.keySet()){
            pq.offer(new Pair(c,hashMap.get(c)));
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int count = pair.count;
            while(count-->0){
                stringBuilder.append(pair.c);
            }
        }
        return stringBuilder.toString();
    }

    static class Pair {
        char c;
        int count;

        Pair(char c, int count) {

            this.c = c;
            this.count = count;
        }
    }
}
