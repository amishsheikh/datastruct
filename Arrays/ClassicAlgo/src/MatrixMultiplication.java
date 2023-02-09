import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m = {{1,1},{1,1}};
        int[][] n = {{1,1},{1,1}};
        System.out.println(Arrays.deepToString(ans(m, n)));
    }

    static int[][] ans(int[][] m , int[][] n){
        int[][] a =new int[m.length][n.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <n.length ; j++) {
                a[i][j]=0;
                for (int k = 0; k < a.length; k++) {
                    a[i][j]+=m[i][k] * n[k][j];
                }
            }
        }
        return a;

    }

}
