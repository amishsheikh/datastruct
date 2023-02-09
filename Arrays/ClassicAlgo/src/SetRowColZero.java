import java.util.Arrays;

public class SetRowColZero {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{1,1,1},{1,1,1}};

        solve(arr);
    }

    static void solve(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=matrix[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==0){
                    helper(i,j,matrix);
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    static void helper(int a,int b,int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][a]=0;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[b][i]=0;
        }

    }
}
