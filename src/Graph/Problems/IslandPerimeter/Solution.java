package src.Graph.Problems.IslandPerimeter;


public class Solution {

    int [] delRow = {-1,0,1,0};
    int [] delCol ={0,1,0,-1};

    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean [][] isVisited = new boolean[n][m];
        int [] result = {0,0};//nof nodes nof edges
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!isVisited[i][j]){
                    dfs(grid,isVisited,i,j,result);
                    i=n;
                    j=m;
                }
            }
        }
        return (4*result[0]-result[1]);
    }

    private void dfs(int[][] grid, boolean[][] isVisited, int i, int j,int [] result) {
        isVisited[i][j]=true;
        result[0]++;
        for(int m=0;m<4;m++){
            int newRow = i+delRow[m];
            int newCol = j+delCol[m];
            if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length
                   && grid[newRow][newCol]==1){
                result[1]++;
                if( !isVisited[newRow][newCol]){
                    dfs(grid,isVisited,newRow,newCol,result);
                }

            }

        }
    }
}
