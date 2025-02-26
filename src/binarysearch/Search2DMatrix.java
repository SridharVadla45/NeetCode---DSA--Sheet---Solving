package src.binarysearch;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        return betterSolution(matrix, target);
    }


    private static boolean betterSolution(int[][] matrix, int target) {
        boolean ans = false;
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int start = 0;
        int end = rowLen * colLen - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            int rowNumber = mid / colLen;
            int colNumber = mid % colLen;
            int temp = matrix[rowNumber][colNumber];
            if (temp == target) return true;
            else if (target < temp) end = mid - 1;
            else start = mid + 1;
            mid = start + (end - start) / 2;
        }
        return ans;
    }

}
