import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n1= in.nextInt();
        int n2= in.nextInt();
        int[] arr = new int[n1];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        int[] arr1 = new int[n2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= in.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int val: arr) {
            if (hm.containsKey(val))
            {
                int of = hm.get(val);
                int nf  =of+1;
                hm.put(val,nf);
            }
            else
                hm.put(val,1);
        }

        for (int val: arr1) {
            if (hm.containsKey(val)){
                System.out.println(val);
                hm.remove(val);
            }
        }
    }
}
