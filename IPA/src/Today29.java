import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Today29 {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        He[] hes= new He[4];
        for (int i = 0; i < hes.length; i++) {
            String x = in.nextLine();
            String y = in.nextLine();
            int z= in.nextInt();in.nextLine();
            boolean w = in.nextBoolean();in.nextLine();
            hes[i] = new He(x,y,z,w);
        }
        String seBr = in.nextLine();
        int t = fP(hes,seBr);
        if (t==0){
            System.out.println("no brand");
        }
        else
            System.out.println(t);
        He r = fA(hes);
        if (r==null){
            System.out.println("no headset");
        }else{
            System.out.println(r.getH());
            System.out.println(r.getP());
        }
    }

    public static int fP(He[] hes,String seBr){
        int s=0;
        for (int i = 0; i < hes.length; i++) {
            if (hes[i].getB().equals(seBr))
                s+=hes[i].getP();
        }
        return s;
    }
    public static He fA(He[] hes){
        int[] arr  = new int[4];
        for (int i = 0; i < hes.length; i++) {
            arr[i]=hes[i].getP();
        }
        Arrays.sort(arr);
        int min = arr[1];
        for (int i = 0; i < hes.length; i++) {
            if (min==hes[i].getP())
                return hes[i];
        }
        return null;
    }


}


class He{
        String h;
        String b;
        int p;
        boolean available;

    public He(String h, String b, int p, boolean available) {
        this.h = h;
        this.b = b;
        this.p = p;
        this.available = available;
    }

    public void setH(String h) {
        this.h = h;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getH() {
        return h;
    }

    public String getB() {
        return b;
    }

    public int getP() {
        return p;
    }

    public boolean isAvailable() {
        return available;
    }
}