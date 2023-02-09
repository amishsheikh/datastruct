import java.util.Scanner;

public class GCD_game {


    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a= in.nextInt();
            int b=in.nextInt();
            if (a==1&&b==1){
                System.out.println("Draw");
            }
            while (a>0||b>0){
                if (b==1){
                    System.out.println("Arjit");
                }
                if (findGCD(a,b)==1){
                    b-=1;
                }
                a-=1;
                if (a==1){
                    System.out.println("Chandu Don");
                }
            }
        }

    }
    static int findGCD(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
