package src.mathandgeometry;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col=matrix[0].length;


        boolean isZeroFR = false;
        boolean isZeroFc = false;
        for(int i=0;i<col;i++){
            if(matrix[0][i]==0) {
                isZeroFR=true;
                break;
            }

        }
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                isZeroFc=true;
                break;
            }
        }


        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=row-1 ;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0) matrix[i][j]=0;
            }
        }

        if(isZeroFR){
            for(int i=0;i<col;i++){
                matrix[0][i]=0;
            }
        }

        if(isZeroFc){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }


    }
}
