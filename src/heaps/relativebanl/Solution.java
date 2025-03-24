package src.heaps.relativebanl;

import java.util.PriorityQueue;

public class Solution {
    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<int []> priorityQueue = new PriorityQueue<>((o1, o2) -> o2[0]-o1[0]);
        for(int i=0;i<score.length;i++){
            priorityQueue.add(new int[]{score[i],i});
        }
        String [] result = new String[score.length];
        int j=1;
        while(!priorityQueue.isEmpty()){
            int [] temp = priorityQueue.poll();
            int pos = temp[1];
            if(j==1){
                result[pos]="Gold Medal";
            }else if(j==2){
                result[pos]="Silver Medal";
            }else if(j==3){
                result[pos]="Bronze Medal";
            }else{
                result[pos]=String.valueOf(j);
            }
            j++;
        }
        return result;
    }
}
