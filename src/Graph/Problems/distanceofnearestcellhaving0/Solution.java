package src.Graph.Problems.distanceofnearestcellhaving0;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static class Cell{
        private int row;
        private int col;
        private int level;
        public Cell(int row ,int col,int level){
            this.col=col;
            this.row=row;
            this.level=level;
        }

    }
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean [][] isVisited = new boolean[n][m];
        int [][] ans = new int[n][m];
        Queue<Cell> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    queue.add(new Cell(i,j,0));
                    isVisited[i][j]=true;
                }
            }
        }

        int [] delRow={-1,0,1,0};
        int [] delCol ={0,1,0,-1};
        while(!queue.isEmpty()){
            Cell cell = queue.poll();

            for(int i=0;i<4;i++){
                int newRow = cell.row+delRow[i];
                int newCol = cell.col+delCol[i];
                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && mat[newRow][newCol]!=0 && !isVisited[newRow][newCol]){
                    ans[newRow][newCol]= cell.level+1;
                    queue.add(new Cell(newRow,newCol, cell.level+1));
                    isVisited[newRow][newCol]=true;
                }
            }

        }

return ans;
    }
}
