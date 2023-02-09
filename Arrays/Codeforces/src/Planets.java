import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Planets {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        int  n = in.nextInt();
        int p = in.nextInt();
        int d=1;  //first machine
        int c= in.nextInt(); //second cost
        int[] arr =new int[p];
//        Vector<> v = new Vector<>(p);
//        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < p; i++) {
            int x= in.nextInt();
           arr[i]=x;
        }

      Arrays.sort(arr);


        for (int j = 0; j < p; j++) {
            for (int i = 0; i < p; i++) {
                if (arr[i]==arr[i+1]){

                }
            }
        }
    }
}
