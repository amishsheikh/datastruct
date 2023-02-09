//https://www.codechef.com/OCT221D/problems/TWOZERO

import java.util.Scanner;

public class TWOZERO {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int t= in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m= in.nextInt();
            int k= ((m*(m-1)*(m+1)/2))%998244353;
            if (m>3 && n<=3){
                System.out.println(k+m);
            } else if (m<3&&n>3) {
               double x=  (((Math.pow(2,m)-1)*m+m)%998244353);
                System.out.println(x);
            }else
                System.out.println(k);
        }
    }
}
