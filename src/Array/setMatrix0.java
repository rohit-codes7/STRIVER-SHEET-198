package Array;

import java.util.Arrays;

public class setMatrix0 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] arr2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][]arr3 ={{1},{0}};


        System.out.println(Arrays.deepToString(setZero(arr3)));

    }

    static int[][] setZero(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        boolean[] rowMarker = new boolean[rows];
        boolean[] colMarker = new boolean[cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (arr[row][col] == 0) {
                    rowMarker[row] = true;
                    colMarker[col] = true;

                }

            }

        }
        //Updating the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (rowMarker[i] || colMarker[j]) {
                    arr[i][j] = 0;
                }

            }

        }
        return arr;
    }
}