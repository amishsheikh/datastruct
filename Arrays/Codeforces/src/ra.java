import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                arr[i]= in.nextInt();
            }
            countFreq(arr, arr.length);


        }
    }

// Java program to count frequencies of array items

    static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
        }

        // To print elements according to first
        // occurrence, traverse array one more time
        // print frequencies of elements and mark
        // frequencies as -1 so that same element
        // is not printed multiple times.
        boolean flag=true;
        for (int i = 0; i < n; i++)
        {
            if (mp.get(arr[i]) != -1)
            {
                if ( mp.get(arr[i])>2)
                {
                    flag=false;
                    System.out.println("no");
                    break;
                }
                mp.put(arr[i], -1);
            }
        }
        if (flag)
            System.out.println("yes");
    }
}
//    ublic int uniquePaths(int m, int n) {
//        int[][] arr = new int[m][n];
//        int count =0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j <n; j++) {
//
//            }
//        }
//    }



