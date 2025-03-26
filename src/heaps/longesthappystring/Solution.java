package src.heaps.longesthappystring;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public String longestDiverseString(int a, int b, int c) {
        HashMap<Character,Integer> charFreq = new HashMap<>();
        charFreq.put('a',a);
        charFreq.put('b',b);
        charFreq.put('c',c);

        PriorityQueue<Character> pq = new PriorityQueue<>((a1,b1)-> charFreq.get(b1)-charFreq.get(a1));
        pq.offer('a');
        pq.offer('b');
        pq.offer('c');
        char prev=' ';
        StringBuilder stringBuilder = new StringBuilder();
        while(!pq.isEmpty()){
            char first = pq.poll();
            char sec=' ';
            if(!pq.isEmpty()) sec=pq.poll();
            if(charFreq.get(first)==0) charFreq.remove(first);
            if(sec!=' ' && charFreq.get(sec)==0) charFreq.remove(sec);
            if(first !=prev && charFreq.containsKey(first)){
                if(charFreq.get(first)>=2){
                    stringBuilder.append(first).append(first);
                    prev=first;
                    if(charFreq.get(first)==2) charFreq.remove(first);
                    else {
                        charFreq.put(first,charFreq.get(first)-2);
                        pq.offer(first);
                    }
                }else{
                    stringBuilder.append(first);
                    prev=first;
                    if(charFreq.get(first)==1) charFreq.remove(first);
                    else {
                        charFreq.put(first,charFreq.get(first)-1);
                        pq.offer(first);
                    }
                }
                if(sec!=' '){
                    if(charFreq.get(sec)>=2){
                        prev=sec;
                        stringBuilder.append(sec).append(sec);
                        if(charFreq.get(sec)==2) charFreq.remove(sec);
                        else {
                            charFreq.put(sec,charFreq.get(sec)-2);
                            pq.offer(sec);
                        }
                    }else{
                        stringBuilder.append(sec);
                        prev=sec;
                        if(charFreq.get(sec)==1) charFreq.remove(sec);
                        else {
                            charFreq.put(sec,charFreq.get(sec)-1);
                            pq.offer(sec);
                        }

                    }
                }

            }else stringBuilder.toString();
        }

        return stringBuilder.toString();



    }
}
