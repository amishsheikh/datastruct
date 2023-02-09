import java.util.Scanner;

public class Willy2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
       int max=0;
        for (int i = 0; i < n; i++) {
            int temp= arr[i];
            for (int j = i; j < n; j++) {
                temp= temp+arr[j+2];
            }
            if (temp>max)
                max=temp;
        }
        System.out.println(max);
    }
}
