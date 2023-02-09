//https://www.codechef.com/OCT221D/problems/BINARYSUB

import java.util.Scanner;

public class BINARYSUB {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i < t; i++) {
            String s= in.next();
            System.out.println(dp(s));
        }
    }

        static int dp(String s){
        int k=s.length();
        int[] arr = new int[k+1];
        arr[k]=1;
        arr[k-1]=1;
            for (int i = k-2; i >=0 ; i--) {
                if (s.charAt(i)!=s.charAt(i+1)){
                    arr[i]=(arr[i+1]+arr[i+2]);
                }
                else
                    arr[i]=arr[i+1];
            }
            return arr[0]%998244353;
        }
//    static int countOccurrences(String word)
//    {
//        // split the string by spaces in a
//       String[] str={"ba","ab","a","b"};
//
//
//        // search for pattern in a
//        int count = 0;
//        for (int i = 0; i < str.length; i++)
//        {
//            // if match found increase count
//            if ()
//                count++;
//        }
//
//        return count%998244353;
//    }

}
