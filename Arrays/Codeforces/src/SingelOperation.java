import java.util.Scanner;
//https://www.codechef.com/OCT221D/problems/SINGLEOP1
public class SingelOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i < t; i++) {
            int n= in.nextInt();
            String s= in.next();
            int count =0;
            for (int j = n-1; j > 0; j--) {
                count++;
                if (s.charAt(j)=='1'){
                    break;
                }

            }
            System.out.println(count);
        }
    }
}
