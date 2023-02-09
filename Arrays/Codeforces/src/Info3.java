import java.util.Arrays;
import java.util.Scanner;

public class Info3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        int k= in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]= in.nextInt();
        }
        int count =0;
      Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int sum = Arrays.stream(arr).sum();
            if(sum/3<n)
            {
                arr[i]=arr[i]+1;
                count++;
            }
        }

        System.out.println(count);
    }
}
