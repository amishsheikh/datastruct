public class Prime {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(17));
//        System.out.println(isPrime(8));
       prime(21);

    }
        static boolean isPrime(int n){
        int m = n/2;
        if(n<=1){
            return false;
        } else if (n==4) {
            return false;
        }
            for (int i = 2; i < m; i++) {
                if(n%i==0){
                    return false;
                }
            }
                  return true;
    }


    static void prime(int n){
        int m=n/2;
        int count =0;
        if (n == 0 || n==1) {
            System.out.println("The number is not prime ");
        }
        else {
            for (int i = 2; i <= m; i++) {
                if (n%i==0){
                    System.out.println("The number is not prime ");
                    count=1;
                    break;
                }
            }
            if (count==0){
                System.out.println("The number is  prime ");
            }
        }



    }
}

//
