package src;

import java.util.HashSet;

public class ValidSudoko {
    public static void main(String[] args) {
       var obj =  new ValidSudoko();
       char [][] board = {
              {'.','.','.', '.','5','.', '.','1','.'},
               {'.','4','.', '3','.','.', '.','.','.'},
               {'.','.','.', '.','.','3', '.','.','1'},

               {'8','.','.', '.','.','.', '.','2','.'},
               {'.','.','2', '.','7','.', '.','.','.'},
               {'.','1','5', '.','.','.', '.','.','.'},

               {'.','.','.', '.','.','2', '.','.','.'},
               {'.','2','.', '9','.','.', '.','.','.'},
               {'.','.','4', '.','.','.', '.','.','.'}};
       obj.isValidSudoku(board);

       }

    public boolean isValidSudoku(char[][] board) {
        // calculate rows valid or not
        HashSet<Character> set =null;
        for(int i=0;i<9;i++){
            set =new HashSet<>();
            for(int j=0;j<9;j++){
                char c = board[i][j];
                if(c!='.'){
                    if(set.contains(c)) return false;
                    set.add(c);
                }
            }
            set.clear();
        }

        //calculate valid columns
        for(int i=0;i<9;i++){
            set =new HashSet<>();
            for(int j=0;j<9;j++){
                char c = board[j][i];
                if(c!='.'){
                    if(set.contains(c)) return false;
                    set.add(c);
                }
            }
            set.clear();
        }

        // calculate valid 3*3 boxes
        int [] tempPos ={0,3,6};
        for(int m:tempPos){
            for(int n:tempPos){
                set =new HashSet<>();
                for(int i=m;i<m+3;i++){

                    for(int j=n;j<n+3;j++){
                        char c = board[i][j];
                        if(c!='.'){
                            if(set.contains(c)) return false;
                            set.add(c);
                        }
                    }
                }
                set.clear();
            }
        }


        return true;


    }
}
