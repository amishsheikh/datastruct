import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IPA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        La[] las =new La[4];
        for (int i = 0; i < las.length; i++) {
            int a= in.nextInt();in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            double d = in.nextDouble();in.nextLine();
            int r = in.nextInt();in.nextLine();

            las[i]= new La(a,b,c,d,r);
        }

        String sb = in.nextLine();
        String sOs = in.nextLine();
        int result = fun(las,sb);
        if (result==0){
            System.out.println("The given brand is not available");
        }else
            System.out.println(result);
        La[] result1 = fun1(las,sOs);
        if (result1==null){
            System.out.println("NULL");
        }else
        {
            for (int i = 0; i < result1.length; i++) {
                System.out.println(result1[i].getR()+" "+result1[i].getL());
            }
        }
    }

    public  static  int fun(La[] las,String sb){
        int count=0;
        for (int i = 0; i < las.length; i++) {
            if (las[i].getB().equals(sb) && las[i].getR()>3)
                count++;
        }
        return count;
    }

    public static La[] fun1(La[] las,String sOs){
        La[] refined = new La[0];
        for (int i = 0; i < las.length; i++) {
            if (las[i].getO().equals(sOs)) {
                refined = Arrays.copyOf(refined, refined.length + 1);
                refined[refined.length - 1] = las[i];
            }
        }

        for(int i=0;i<refined.length-1;i++){
            for(int j=0;j<refined.length-i-1;j++){
                if(refined[j].getL()<refined[j+1].getL()){
                    La temp=refined[j];
                    refined[j]=refined[j+1];
                    refined[j+1]=temp;
                }

            }
        }

        return refined;
    }
}

class La{
    int l;
    String b;
    String o;
    double p;
    int r;

    public La(int l, String b, String o, double p, int r) {
        this.l = l;
        this.b = b;
        this.o = o;
        this.p = p;
        this.r = r;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setO(String o) {
        this.o = o;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getL() {
        return l;
    }

    public String getB() {
        return b;
    }

    public String getO() {
        return o;
    }

    public double getP() {
        return p;
    }

    public int getR() {
        return r;
    }
}
