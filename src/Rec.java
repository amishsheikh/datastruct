public class Rec {

    public static void main(String[] args) {
        System.out.println( trailingZeroes(200));
        System.out.println();
    }

    static long solution(long  n){
       if(n>=1){
           return n *solution(n-1);
       }
       else
           return 1;
    }

    public static int trailingZeroes(int n) {
        int f=0;
        while(n>0){
            f+=n/5;
            n=n/5;
        }
        return f;
    }
    static long factorial(int n){
        long fact=1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
    static int ans(long n){
        int count =0;
        n=solution(n);
        while (n>0){
            long rem=n%10;
            if (rem == 0) {
                count++;
            }
            n/=10;
        }
        return count;
    }
}
