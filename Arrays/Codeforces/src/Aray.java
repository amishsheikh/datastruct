import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Aray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] d = new int[n];
            for (int j = 0; j < n; j++) {
                d[j] = in.nextInt();
            }
            int[] a = new int[n];
            a[0] = d[0];
            for (int j = 1; j < n; j++) {
                int c = d[j] + a[j - 1];
                int x = d[j] - a[j - 1];
                if (c > 0 && x > 0) {
                    System.out.println(-1);
                    return;

                }

                if (c > 0) {
                    a[j] = c;
                } else if (x > 0) {
                    a[j] = x;
                }


            }
            System.out.println(Arrays.toString(a));

        }
    }
}
