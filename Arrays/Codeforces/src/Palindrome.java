import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testty = in.nextInt();
        for (int i = 0; i < testty; i++) {
            int n  = in.nextInt();
            int[] arr = new int[n];
            int count=0;
            for (int j = 0; j < n ; j++) {
                arr[j] = in.nextInt();
            }
            int l =0;
            int r=n-1;

            int k=0;
            for (int j = 0; j < n; j++) {
                 if (arr[l]==arr[r]) {
                     k++;
                    l++;
                    r--;
                }
            }


            while (l<r){
                for (int j = 0; j <n ; j++) {
                    if (arr[l]!=arr[r]&&arr[l]<arr[n-1]) {
                              arr[l]=arr[l]+1;
                              count++;
                          }  else {
                              l++;
                              r--;
                          }
                      }


                }
            if (k==n)
                System.out.println(0);
else
                       System.out.println(count-1);

        }
    }


}

