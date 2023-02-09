public class FirstPower {
    public static void main(String[] args) {
//        System.out.println(2&1);
        System.out.println(powerModulo(3978432,5,1000000007));
    }

    static int power(int a,int b){
        int res =1;
        while (b>0){
            if ((b&1)!=0){   //if the number is odd;
                res = res * a;
            }
//          if number is even
            a=a*a;
            b=b>>1;  //left shift operator to divide the number by 2 means b/2

        }
        return res;
    }

//    modulo operation code to get the large value ans
   static long powerModulo(long a,long b,int n){

    long res =1;
    while (b>0){
        if ((b&1)!=0){   //if the number is odd;
            res = (res * a % n)%n;
        }
//          if number is even
        a=(a%n*a%n)%n;
        b=b>>1;  //left shift operator to divide the number by 2 means b/2

    }
    return res;
}


}
