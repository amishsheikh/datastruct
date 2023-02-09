//2D matrix multiplication

import java.util.Arrays;

public class StrassensMatrixMultiplication {

    public static void main(String[] args) {
        int[][] ar1={{1,1},{1,1}};
        int[][] ar2={{1,1},{1,1}};
        System.out.println(Arrays.deepToString(ans(ar1, ar2)));
    }

    static int[][] ans(int[][] arr1,int[][] arr2){
        int[][] ans = new int[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                ans[i][j]=0;
                for (int k = 0; k < ans.length ; k++) {
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return ans;
    }
}
