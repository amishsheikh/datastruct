import java.util.Arrays;

public class sieveOfEratonese {
    public static void main(String[] args) {
            int isPrime = sieve(2);
            System.out.println(isPrime);
            boolean[] is_prime = sieveOf(2);
         for (int i = 0; i <=2 ; i++) {
            System.out.println(i+" " +is_prime[i]);
        }
    }
//this code give us the count of  prime number from 1 to 100
    static int sieve(int n){
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        int count=0;
        for (int i = 2; i * i<=n ; i++) {
            for (int j = 2*i; j <=n ; j+=i) {
                isPrime[j]=false;
            }
        }

        for (int i = 2; i <n ; i++) {
            if (isPrime[i]){
                count++;
            }
        }
        return count;
    }
    //this code give us prime number from 1 to 100
    static boolean[] sieveOf(int n){
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for (int i = 2; i * i<=n ; i++) {
            for (int j = 2*i; j <=n ; j+=i) {
                isPrime[j]=false;
            }
        }


        return isPrime;
    }

}
