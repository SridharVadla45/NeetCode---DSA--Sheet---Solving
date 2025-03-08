package src.Graph.Problems.mapofhighestpeak;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        int [][] isWater = {{0,0,1},{1,0,0},{0,0,0}};
        Solution solution = new Solution();
        int [][] result =solution.highestPeak(isWater);
        for(int [] row: result){
            System.out.println(Arrays.toString(row));
        }
    }

    int [] delRow ={-1,0,1,0};
    int [] delCol ={0,1,0,-1};

    static class Cell{
        int row;
        int col;
        int height;

        Cell(int row,int col,int height){
            this.row=row;
            this.col=col;
            this.height=height;
        }

        @Override
        public String toString() {
            return "Cell{" +
                    "row=" + row +
                    ", col=" + col +
                    ", height=" + height +
                    '}';
        }
    }

    public int[][] highestPeak(int[][] isWater) {
        int rows=isWater.length;
        int cols=isWater[0].length;

        boolean [][] isVisited = new boolean[rows][cols];
        int [][] result = new int[rows][cols];
        Queue<Cell> queue = new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!isVisited[i][j] && isWater[i][j]==1){
                    queue.add(new Cell(i,j,0));
                    isVisited[i][j]=true;
                }
            }
        }

        while(!queue.isEmpty()){
           Cell cell = queue.poll();
            System.out.println(cell.toString());
           result[cell.row][cell.col]= cell.height;
           for(int i=0;i<4;i++){
               int newRow = cell.row+delRow[i];
               int newCol = cell.col+delCol[i];
               if(newRow>=0 && newRow<rows && newCol>=0 && newCol<cols && !isVisited[newRow][newCol]){
                   queue.add(new Cell(newRow,newCol,cell.height+1));
                   isVisited[newRow][newCol]=true;

               }
           }

        }




        return result;
    }
}
