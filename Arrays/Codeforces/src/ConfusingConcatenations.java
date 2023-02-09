import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConfusingConcatenations {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i < t; i++) {
            int n= in.nextInt();
            ArrayList<Integer> C=new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                C.add(j, in.nextInt());
            }
            ArrayList<Integer> A=new ArrayList<>(n/2);
            for (int j = 0; j < n/2; j++) {
                A.add(j,C.get(j));

            }
            ArrayList<Integer> B=new ArrayList<>(n/2);
            for (int j = n/2; j < n; j++) {

                B.add(j-n/2,C.get(j) );

            }
            if (A.size()==1&&B.size()==1){
                System.out.println(-1);
            }else {
                System.out.println(A.size());
                System.out.println(B.size());
                System.out.println(A);
                System.out.println(B);
            }



        }

    }
}
