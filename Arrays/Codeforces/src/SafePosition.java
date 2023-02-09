import java.util.Vector;

public class SafePosition {
    public static void main(String[] args) {
        System.out.println(safePos(2,1));
//        Vector<Integer> v = new Vector<Integer>(2);
//        for (int i = 1; i <=2; i++) {
//            v.add(i);
//        }
//        v.remove(0);
//        System.out.println(v);

    }

    static int safePos(int n, int k) {
        // code here
        if (n==1){
            return 1;
        }
        return (safePos(n-1,k)+k-1)%n+1;
    }
}
