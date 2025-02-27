package src.mathandgeometry;

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
       int [][] matrix = new int [n][n];
       int a =0;
       int b =n-1;
       int p=0;
       int q=n-1;
       int count =1;
       while(a<=b && p<=q){
           //first row
           for(int i=p;i<=q;i++){
               if(matrix[a][i]==0){
                   matrix[a][i]=count++;
               }
           }
           //last col
           for(int i=a;i<=b;i++){
               if(matrix[i][q]==0){
                   matrix[i][q]=count++;
               }
           }
           //last row
           for(int i=q ;i>=p;i--){
               if(matrix[b][i]==0){
                   matrix[b][i]=count++;
               }
           }
           //first col
           for(int i=b;i>=a;i--){
               if(matrix[i][p]==0){
                   matrix[i][p]=count++;
               }
           }
           a++;
           b--;
           p++;
           q--;

       }
       return matrix;

    }
}
