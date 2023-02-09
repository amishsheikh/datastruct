import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(ans(10));
    }

    static int ans(int n){
        boolean[] prime = new boolean[n];
        for (int i = 2; i*i <n; i++) {
            if (!prime[i]){
                for (int j = i; j *i<n; j++) {
                    prime[j*i]=true;
                }
            }
        }

        int count =0;
        for (int i = 2; i <n ; i++) {
            if (!prime[i]){
                count++;
            }
        }
        return count;
    }
}
