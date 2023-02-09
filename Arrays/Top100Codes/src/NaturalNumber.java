public class NaturalNumber {
    public static void main(String[] args) {
//        System.out.println(ans(10));
//        System.out.println(ans1(12,15));
//        System.out.println(ans2(1,2,3));
//         System.out.println(ans3(1922));


    }

    static int ans(int n){
        return n*(n+1)/2;
    }

//    Find the Sum of the Numbers in a Given Range in Java

    static int ans1(int n1,int n2){
        int sum=0;
        for (int i = n1; i <=n2 ; i++) {
            sum=sum+i;
        }
        return sum;
    }

//   Greatest of the Three numbers


    static int ans2(int n1,int n2,int n3){
        if(n1>n2 && n1>n3){
            return  n1;
        } else if (n2>n1 && n2>n3) {
            return n2;
        }
        else
            return n3;
    }

    static boolean ans3(int n){
        if (n%4==0 && n%100!=0){
            return true;
        }
        else if(n%400==0)
            return true;
        else
            return false;
    }

//    static int ans4(int n){
//        boolean[] prime=new boolean[n];
//        for (int i = 2; i *i <=n ; i++) {
//            prime[i*i] = true;
//
//        }
//    }


}
