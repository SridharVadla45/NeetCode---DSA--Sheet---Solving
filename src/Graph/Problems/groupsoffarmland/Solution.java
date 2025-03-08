package src.Graph.Problems.groupsoffarmland;

import java.util.ArrayList;

public class Solution {
    int [] delRow ={-1,0,1,0};
    int [] delCol ={0,1,0,-1};

    public int[][] findFarmland(int[][] land) {
       int n=land.length;
       int m =land[0].length;
        ArrayList<int []> ans = new ArrayList<>();
       boolean [][] isVisited = new boolean[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(!isVisited[i][j] && land[i][j]==1){
                   int [] temp = {i,j,i,j};
                   dfs(land,isVisited,i,j,temp);
                   ans.add(temp);
               }
           }
       }
       int [][] result = new int[ans.size()][4];
       int p=0;
       for(int [] a: ans){
           result[p]=a;
           p++;
       }
       return result;
    }

    private void dfs(int[][] land, boolean[][] isVisited, int i, int j, int[] temp) {
        isVisited[i][j]=true;
        for(int m=0;m<4;m++){
            int newRow = i+delRow[m];
            int newCol = j+delCol[m];
            if(newRow>=0 && newRow<land.length && newCol>0 && newCol<land[0].length && !isVisited[newRow][newCol] &&
            land[newRow][newCol]==1){
                temp[2]=Math.max(temp[2],newRow);
                temp[3]=Math.max(temp[3],newCol);
                dfs(land,isVisited,newRow,newCol,temp);
            }
        }
    }
}
