import java.security.SecureRandom;
import java.util.Scanner;

public class SingleOperation20 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i < t; i++) {
            int n= in.nextInt();
            String s= in.next();
            int left=0;
            int right=1;
            for(int j=1;j<n;j++){
                if(s.charAt(j)=='0'){
                    right++;
                }
                else break;

            }
//            for(int k=n-1;k>=0;k--){
//                if(s.charAt(k)=='1'){
//                    left++;
//                }
//                else break;
//
//            }
            System.out.println(right);
//          if (right==n&&left==n){
//              System.out.println(1);
//          }else if(left==right){
//              System.out.println(right);
//          } else if (left==1&&right==1) {
//              System.out.println(n-1);
//          }else if(left==n-1){
//              System.out.println(1);
//          }


        }
    }
}
