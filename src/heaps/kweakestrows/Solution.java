package src.heaps.kweakestrows;

import java.util.PriorityQueue;

public class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1]; // Compare by field1 (a[1], b[1])
            } else {
                return a[0] - b[0]; // If field1 is equal, compare by field0 (a[0], b[0])
            }
        });

        int j=0;
        for(int [] arr : mat){

            int count =0;
            for(int i : arr){
                if(i==1)count++;
                else{
                    pq.offer(new int[]{j,count});
                    break;
                }
            }
            j++;
        }

        int [] result =new int[k];
        int m=0;
        while (k-->0 && !pq.isEmpty()){
            result[m]=pq.poll()[0];
            m++;
        }
        return result;
    }



}
