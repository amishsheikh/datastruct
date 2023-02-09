import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int m = in.nextInt();
        int x = 0;
        int y=0;
        int count=1;
        while (m-->0){
             x=in.nextInt();
             y=in.nextInt();
             x=x+arr[x-1]+y;
            while (x<=n){
                x=x+arr[x-1]+y;
            count++;
            }
            System.out.println(count);
        }


    }

//    public  static  int calculateminCost(int N, int Q, int A, int B, List<Integer> X){
//
//    }
}
