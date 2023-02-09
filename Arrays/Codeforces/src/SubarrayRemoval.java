import java.util.Scanner;
import java.util.function.LongBinaryOperator;

public class SubarrayRemoval {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int testcase= in.nextInt();
        while (testcase-->0){
            int n= in.nextInt();
            int[] arr = new int[n];
            long ones=0;
            long twos=0;
            for (int i = 0; i < n; i++) {
                arr[i]= in.nextInt();
                if (arr[i]==0){
                    ones++;
                }else
                    twos++;
            }
            long ans =Math.min(ones,twos);
            twos=  Math.max(0L,twos-ones);
            ans = ans+(twos)/3;
            System.out.println(ans);

        }
    }

}
