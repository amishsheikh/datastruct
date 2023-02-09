//https://www.codechef.com/submit/EQUALIZEAB

import java.util.Scanner;

public class EqualizeAB {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            int a= in.nextInt();
            int b= in.nextInt();
            int x= in.nextInt();
        if (as(a,b,x)){
            System.out.println("yes");
        }
        else
            System.out.println("no");
        }
    }

    private static boolean as(int a, int b, int x) {
        if (a==b)
            return true;
        if(a<0 || b<0){
            return false;
        }
        if (a+x==b-x || a-x==b+x){
            return true;
        }else
        {
          return as(a-x,b+x,x);
        }


    }


}
