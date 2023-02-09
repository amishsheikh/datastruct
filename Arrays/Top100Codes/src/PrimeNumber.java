public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println( ans(8));;
    }


    static boolean ans(int n){
        if (n==1 || n==0){
            return false;
        }
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
              return false;
            }
        }

       return true;

    }

//     Prime number within a given range


}
