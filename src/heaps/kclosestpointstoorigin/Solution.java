package src.heaps.kclosestpointstoorigin;

import java.util.PriorityQueue;

public class Solution {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> maxHeap = new PriorityQueue<>(k,(a, b)->{
                if(distance(b) - distance(a)>0) return 1;
                else if (distance(b)==distance(a)) return 0;
                else return -1;
    });
        for(int [] point : points){
            maxHeap.offer(point);
            if(maxHeap.size()>k) maxHeap.poll();
        }

        int [][] result = new int[k][2];
        for(int i=0;i<k;i++){
            result[i]=maxHeap.poll();
        }
        return result;
    }

    private double distance(int [] point){
        return Math.sqrt(point[0]*point[0]+point[1]*point[1]);
    }

}
