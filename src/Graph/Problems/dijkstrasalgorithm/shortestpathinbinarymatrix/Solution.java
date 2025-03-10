package src.Graph.Problems.dijkstrasalgorithm.shortestpathinbinarymatrix;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {

        int rows = grid.length;
        int cols =grid[0].length;
        if(grid[0][0]==1 || grid[rows-1][cols-1]==1) return -1;
        int [][] dist = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                dist[i][j]= (int) 1e9;
            }
        }

        dist[0][0]=1;
        Queue<int []> priorityQueue=new LinkedList<>();
        priorityQueue.add(new int[]{0,0,1});
        while (!priorityQueue.isEmpty()){
            int [] current = priorityQueue.poll();
            int i=current[0];
            int j=current[1];
            int w=current[2];
            for(int m=-1;m<=1;m++){
                int newRow = i+m;
                for(int n=-1;n<=1;n++){
                    int newCol =j+n;
                    if(newRow==i && newCol==j) continue;
                    if(newRow>=0 && newRow< grid.length && newCol>=0 && newCol<grid[0].length&& grid[newRow][newCol]==0){
                        if(w+1<dist[newRow][newCol]){
                            dist[newRow][newCol]=w+1;
                            priorityQueue.add(new int []{newRow,newCol,w+1});
                        }
                    }
                }
            }
        }
        if(dist[rows-1][cols-1]==1e9) return -1;
        return dist[rows-1][cols-1];
    }
}
