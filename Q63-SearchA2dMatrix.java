class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        int mid = start + (end - start) / 2;

…                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return false;
        
    }
}
