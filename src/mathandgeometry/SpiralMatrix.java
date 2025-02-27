package src.mathandgeometry;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        boolean [][] isVisited = new boolean [row][col];

        int m=0;
        int n =row-1;
        int p=0;
        int q=col-1;

        while(m<=n && p<=q) {
            //first row
            for (int i = p; i <=q; i++) {
                if( !isVisited[m][i]) {
                    ans.add(matrix[m][i]);
                    isVisited[m][i]=true;
                }
            }
            //last col
            for (int i = m; i <=n; i++) {
                if(  !isVisited[i][q]) {
                    ans.add(matrix[i][q]);
                    isVisited[i][q]=true;
                }
            }
            //last row
            for (int i = q; i >=p; i--)  {
                if(!isVisited[n][i]) {
                    ans.add(matrix[n][i]);
                    isVisited[n][i]=true;
                }
            }
            //first col
            for (int i = n; i >= m; i--) {
                if( !isVisited[i][p]) {
                    ans.add(matrix[i][p]);
                    isVisited[i][p]=true;
                }
            }

            m++;
            n--;
            p++;
            q--;

        }

        return  ans ;
    }


}
