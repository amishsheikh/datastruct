import java.util.Arrays;
import java.util.Scanner;

public class RecoveryArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr =new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]= in.nextInt();
            }
//            int[] arr1 =new int[n];
//            arr1[0]=arr[0];
//            for (int j = 1; j < n; j++) {
//                arr1[j] = arr1[j-1] +arr[j];
//            }

            int[] arr2 = new int[n];
            arr2[0]=arr[0];
            for (int j = 1; j < n-1; j++) {
                arr2[j] = arr2[j-1] +arr[j];
                arr2[j+1]=arr2[j-1] +arr[j+1];
            }
            System.out.println(Arrays.toString(arr2));

//            if (Arrays.compare(arr1,arr2)==1){
//                System.out.println(Arrays.toString(arr1));
//            }
//            else
//                System.out.println(-1);


        }
    }


}
