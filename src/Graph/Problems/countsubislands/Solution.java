package src.Graph.Problems.countsubislands;

public class Solution {

    int [] delRow ={-1,0,1,0};
    int [] delCol={0,1,0,-1};

    public int countSubIslands(int[][] grid1, int[][] grid2) {
            int n = grid2.length;
            int m =grid2[0].length;

            boolean [][] isVisited = new boolean[n][m];
            int count=0;

            for(int i=0;i< n;i++){
                for(int j=0;j<m;j++){
                    if(!isVisited[i][j] && grid2[i][j]==1){
                        int [] flag = {0};
                        dfs(grid2,grid1,i,j,isVisited,flag);
                        if(flag[0]!=1) count++;
                    }
                }
            }
            return count;
    }

    private void dfs(int[][] grid2, int[][] grid1, int i, int j, boolean[][] isVisited, int[] flag) {
        isVisited[i][j]=true;
        if(grid1[i][j]==0 && flag[0]!=1) flag[0]=1;
        for(int m=0;m<4;m++){
            int newRow = i+delRow[m];
            int newCol = j+delCol[m];
            if(newRow>=0 && newRow< grid2.length && newCol>=0 && newCol<grid2[0].length
                         && !isVisited[newRow][newCol]
                         && grid2[newRow][newCol]==1){
                dfs(grid2,grid1,newRow,newCol,isVisited,flag);
            }
        }
    }
}
