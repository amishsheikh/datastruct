import java.util.HashMap;
import java.util.Scanner;

public class LongestConseutiveSequence {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        int n1= in.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i]=in.nextInt();
        }
        HashMap<Integer, Boolean> hm = new HashMap();
        for (int val : arr) {
            hm.put(val,true);
        }

        for (int val: arr) {
            if (hm.containsKey(val-1))
                hm.put(val,false);
        }
        int ml= 0;
        int msp =0;
        for (int val: arr) {
            if (hm.get(val)==true){
                int tl =1;
                int tsp = val;

                while (hm.containsKey(tsp+tl))
                    tl++;

                if (tl>ml){
                    msp=tsp;
                    ml=tl;
                }
            }
        }

        for (int i = 0; i < ml; i++) {
            System.out.print(msp+i+" ");
        }
    }
}
