import java.util.Arrays;
import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= in.nextInt();
            }
            Arrays.sort(arr);
            int a=Arrays.stream(arr).sum();

            int count=0;
            if (arr[0]==0)
                count=1;

          int i=0;
            int j=n-1;
            while (i<j){
                if ((arr[i]^arr[j])!=0)
                    count++;
                i++;j--;
            }
            if (a==0)
                count=0;
            System.out.println(count);
        }
    }
}
