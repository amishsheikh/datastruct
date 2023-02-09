import java.awt.*;
import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(n * (n + 1) / 2 - sum);
        }

    }
}
