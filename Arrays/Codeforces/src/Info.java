import java.util.Arrays;
import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int d= in.nextInt();
        int[][] s= new int[2][2];
       while (n-->0){
           for (int i = 0; i < 2; i++) {
               for (int j = 0; j < 2; j++) {
                   s[i][j]= in.nextInt();
               }
           }
       }
        System.out.println(Arrays.deepToString(s));
    }
}
