class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        int val = 1;

        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;

        while(left <= right && top <= bottom){

            for(int j = left;j <= right;j++){
                matrix[top][j] = val;
                val++;
            }
            top++;
            for(int i = top;i <= bottom;i++){
                matrix[i][right] = val;
                val++;
            }
            right--;
            if(top <= bottom){
                for(int j = right;j >= left;j--){
                    matrix[bottom][j] = val;
                    val++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom;i >= top;i--){
                    matrix[i][left] = val;
                    val++;
                }
                left++;
            }

            
        }
        return matrix;
    }
}