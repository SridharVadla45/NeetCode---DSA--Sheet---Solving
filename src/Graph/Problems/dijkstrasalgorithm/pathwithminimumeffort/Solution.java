package src.Graph.Problems.dijkstrasalgorithm.pathwithminimumeffort;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    int [] delRow ={-1,0,1,0};
    int [] delCol ={0,1,0,-1};

    public int minimumEffortPath(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;

        int [][] dist = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                dist[i][j]=(int) 1e9;
            }
        }

        dist[0][0]=0;
        PriorityQueue<int []> queue=new PriorityQueue<>((a,b)->a[2]-b[2]);
        queue.add(new int []{0,0,0});
        while(!queue.isEmpty()){
            int [] current = queue.poll();
            int i=current[0];
            int j=current[1];
            int w= current[2];
            if(i==rows-1 && j==cols-1) return w;
            for(int m=0;m<4;m++){
                int newRow =i+delRow[m];
                int newCol=j+delCol[m];
                if(newRow>=0 && newRow<rows && newCol>=0 && newCol<cols){
                    int effort = Math.max(Math.abs(heights[i][j]-heights[newRow][newCol]),w);
                    if(effort<dist[newRow][newCol]){
                        dist[newRow][newCol]=effort;
                        queue.add(new int[]{newRow,newCol,effort});
                    }
                }
            }

        }
        return 0;


    }
}
