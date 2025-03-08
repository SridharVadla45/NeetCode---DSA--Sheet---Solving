package src.Graph.Problems.shortestbridge;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int [] delRow ={-1,0,1,0};
    int [] delCol = {0,1,0,-1};

    public int shortestBridge(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] isVisited = new boolean[rows][cols];

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!isVisited[i][j] && grid[i][j] == 1) {

                    dfs(grid, i, j, isVisited, queue);
                }

                while (!queue.isEmpty()) {
                    int levelsize = queue.size();
                    while(levelsize-->0) {


                        int[] cell = queue.poll();
                        int row = cell[0];
                        int col = cell[1];
                        int dist = cell[2];
                        for (int m = 0; m < 4; m++) {
                            int newRow = row + delRow[m];
                            int newCol = col + delCol[m];
                            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                                    && !isVisited[newRow][newCol]) {
                                if (grid[newRow][newCol] == 1) {
                                    return dist;
                                } else {
                                    isVisited[newRow][newCol] = true;
                                    queue.offer(new int[]{newRow, newCol, dist + 1});
                                }
                            }

                        }
                    }

                }


            }

        }

   return -1;
    }

    private void dfs ( int[][] grid, int i, int j, boolean[][] isVisited, Queue<int[]>queue){
        queue.add(new int[]{i, j, 0});
        isVisited[i][j] = true;
        for (int m = 0; m < 4; m++) {
            int newRow = i + delRow[m];
            int newCol = j + delCol[m];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                    && !isVisited[newRow][newCol] && grid[newRow][newCol] == 1) {
                dfs(grid, newRow, newCol, isVisited, queue);
            }
        }

    }

}
