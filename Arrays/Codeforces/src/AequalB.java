import java.util.Scanner;

public class AequalB {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n =in.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int count =0;
            int count1 =0;
            for (int j = 0; j < n; j++) {
                arr1[j] = in.nextInt();
            }
            for (int j = 0; j < n ; j++) {
               arr2[j] = in.nextInt();
            }
            int c=0;
            for (int j = 0; j < n; j++) {
                if (arr1[j]==1 )
                    count++;
                if (arr2[j]==1 )
                    count1++;
                if (arr1[j]==arr2[j])
                    c++;

            }
            if (n==1){
                if (arr1[0] == arr2[0])
                    System.out.println(0) ;
                else
                    System.out.println(1);
            }
            if (c==n)
                System.out.println(0);
            if (count==count1){
                System.out.println(1);
            } else if (count1>count) {
                System.out.println(count);
            }
            else
                System.out.println(count1);

        }
    }


}
