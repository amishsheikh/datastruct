import java.util.Scanner;

public class BInSubstiution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();

        for (int i = 0; i < t; i++) {
           String s= in.next();
           int n =s.length();
           int l=1;
            for (int j = 0; j < n-1; j++) {
                if ((s.charAt(j)=='a' && s.charAt(j+1)=='b')|| (s.charAt(j)=='b' && s.charAt(j+1)=='a')){

                    l=(l*2)%998244353;
                }
            }
            System.out.println(l);

        }
    }


        }



