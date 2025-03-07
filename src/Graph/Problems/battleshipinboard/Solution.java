package src.Graph.Problems.battleshipinboard;

import java.util.HashSet;
class Solution {
    int [] delRow ={-1,0,1,0};
    int [] delCol ={0,1,0,-1};

    public int countBattleships(char[][] board) {
        int n=board.length;
        int m =board[0].length;
        boolean [][] isVisited = new boolean[n][m];
        int count=0;
        HashSet<Integer> a=null;
        HashSet<Integer> b=null;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!isVisited[i][j] && board[i][j]=='X'){
                    a=new HashSet<>();
                    b=new HashSet<>();
                    dfs(board,isVisited,i,j,a,b);
                    if(a.size()==1 || b.size()==1)count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] board, boolean[][] isVisited, int i, int j, HashSet<Integer> a, HashSet<Integer> b) {
        isVisited[i][j]=true;
        a.add(i);
        b.add(j);
        for(int m=0;m<4;m++){
            int newRow = i+delRow[m];
            int newCol = j+delCol[m];
            if(newRow>=0 && newRow<board.length && newCol>=0
                    && newCol<board[0].length
                    && !isVisited[newRow][newCol]
                    && board[newRow][newCol]=='X'){
                dfs(board,isVisited,newRow,newCol,a,b);
            }
        }
    }


}