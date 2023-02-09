public class CountPrime {
    public static void main(String[] args) {
        System.out.println(count(100));
    }

    static int count(int n){
        int count=0;
        for (int i = 1; i <n ; i++) {
            if (isPrime(n)){
                count++;
            }
        }
        return count ;

    }

    static boolean isPrime(int n){
        for (int i = 2; i < n/2; i++) {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
