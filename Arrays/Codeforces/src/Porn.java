import java.util.Scanner;

public class Porn {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        long[] f =new long[1000001];
        f[0]=1;f[1]=1;
        for (int i = 2; i < 1000001; i++) {
            f[i] = (i*f[i-1])%1000000007;
        }

        while (t-->0){
            long  sum=0;
            long n= in.nextLong();
            while (n-->0){
                long temp= in.nextLong();
                sum=(sum+f[(int) temp]);

            }
            System.out.println(sum%1000000007);
        }
    }
}
