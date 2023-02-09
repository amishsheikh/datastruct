import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CodeI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testty = in.nextInt();
        for (int i = 0; i < testty; i++) {
            int number  = in.nextInt();
            int[] arr = new int[number];
            for (int j = 0; j < number ; j++) {
                arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
          if (isIncreasing(arr)){
              System.out.println("yes");
          }
          else
              System.out.println("no");
        }
    }

    public static boolean isIncreasing(int[] a) {
        return IntStream.range(1, a.length).reduce(0, (acc, e) -> acc + (a[e - 1] < a[e] ? 0 : 1)) == 0;
    }

}
