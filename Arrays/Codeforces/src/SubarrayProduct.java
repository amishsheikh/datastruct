import java.math.BigInteger;
import java.util.Arrays;

public class SubarrayProduct {
    public static void main(String[] args) {
        int[][] trees ={ {1, 2}, {3, 2}, {4, 5}, {7, 1}, {10, 4} };
        int[][] queries= { {0, 12}, {4, 6}, {2, 8} };
//        System.out.println(queries.length);
        for (int i = 0; i < queries.length;i++) {
            int sum=0;
            int k=0;
            for (int j = 0; j < queries.length-1; j++) {
                k= queries[i][j];
                sum=sum+k;
            }
            int m=sum-k;
//            System.out.println((m,k,trees));;
        }
    }



    static long subarrayProduct(int a[], int n)
    {

        Arrays.sort(a);
        int k=subArray(n);

        int product = 1;


        if (a[n - 1] == 0 && k % 2 != 0)
            return 0;

        if (a[n - 1] <= 0 && k % 2 != 0) {
            for (int i = n - 1; i >= n - k; i--)
                product *= a[i];
            return product;
        }


        int i = 0;


        int j = n - 1;


        if (k % 2 != 0) {
            product *= a[j];
            j--;
            k--;
        }


        k >>= 1;

        for (int itr = 0; itr < k; itr++) {
            // product from left pointers
            int left_product = a[i] * a[i + 1];


            int right_product = a[j] * a[j - 1];


            if (left_product > right_product) {
                product *= left_product;
                i += 2;
            }
            else {
                product *= right_product;
                j -= 2;
            }
        }

        return product;
    }

    static int subArray( int n) {
        int count = 0;

        // Pick starting point
        for (int i = 0; i < n; i++) {
            // Pick ending point
            for (int j = i; j < n; j++) {
                // Print subarray between current starting
                // and ending points
                for (int k = i; k <= j; k++)
                    count++;

            }
        }
        return count;
    }
}

