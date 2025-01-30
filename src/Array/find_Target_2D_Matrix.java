package Array;

public class find_Target_2D_Matrix {
    public static void main(String[] args) {
        int [][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean ans =searchMatrix(matrix,23);
        System.out.println(ans);


    }
    public static boolean searchMatrix(int[][] matrix, int target){
        int n  = matrix.length;
        int m = matrix[0].length;
        int low  = 0;
        int high = n*m-1; // because we are treating as 1-D array
        while (low<=high){
            int mid  = (high+low)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col]== target) return true;
            else if (matrix[row][col]<target)low = mid+1;
            else high =mid-1;


        }
        return false;
    }
}
