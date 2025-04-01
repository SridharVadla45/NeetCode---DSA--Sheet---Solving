package src.heaps.kthsmallestprimefraction;

import java.util.PriorityQueue;

public class Solution {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> minHeap = new PriorityQueue<>(k, (a, b) -> Double.compare(a[0], b[0]));
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                minHeap.offer(new double[]{arr[i]/arr[j],arr[i],arr[j]});
                if(minHeap.size()>k)minHeap.poll();
            }
        }
        int [] result = new int[2];
        double [] temp =minHeap.poll();
        result[0]=(int)temp[1];
        result[1]=(int)temp[2];
        return result;
    }
}
