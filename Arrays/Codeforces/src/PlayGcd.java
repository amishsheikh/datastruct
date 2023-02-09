import java.util.Scanner;

public class PlayGcd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j]= in.nextInt();
            }
            if (n%2==0)
                System.out.println("yes");
            else if (n==1)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
