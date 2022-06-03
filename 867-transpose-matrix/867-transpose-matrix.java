class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] sol = new int[cols][rows];
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j=0; j<matrix[0].length; j++) 
            {
                sol[j][i] = matrix[i][j];
            }
        }
        return sol;
    }
}