package src.mathandgeometry;

public class RotateImage {
    public void rotate(int[][] matrix) {
        bruteSolution(matrix);
    }


    private static void bruteSolution(int [][] matrix ){
        int row = matrix.length;
        int col = matrix[0].length;

        int [][] temp = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[i][j]=matrix[i][j];
            }
        }

        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
               matrix[i][j]= temp[row-j][i];
            }
        }

    }


    private static void betterSolution(int [][] matrix){
        // transpose and swap columns
        int row=matrix.length;
        int col = matrix[0].length;

        //Transpose
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j>i) {
                    int temp =matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        // swap colums
        for(int i=0;i<col/2;i++){
            for(int j=0;j<row;j++){
                int temp = matrix[j][i];
                matrix[j][i]=matrix[j][col-i-1];
                matrix[j][col-i-1]=temp;
            }
        }
    }

}
