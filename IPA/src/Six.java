import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Ph[] phs = new Ph[4];
        for (int i = 0; i < phs.length; i++) {
            int a= in.nextInt();in.nextLine();
            String b = in.next();
            String c= in.next();
            int d= in.nextInt();in.nextLine();
            phs[i] = new Ph(a,b,c,d);
        }
        String Br= in.next();
        String seOS= in.next();
        int sum =findP(phs,Br);
        System.out.println(sum);
        Ph result=getPid(phs,seOS);
        if(result==null)
            System.out.println( "No phones are available with specified os and price range");
        else
            System.out.println(result.getpI());

    }

    public static int findP(Ph[] phs,String Br){
        int sum=0;
        for (int i = 0; i < phs.length; i++) {
            if (phs[i].getB().equals(Br)){
                sum+=phs[i].getp();
            }
        }
        return sum;
    }
    public static Ph getPid(Ph[] phs,String seOS){
        for (int i = 0; i < phs.length; i++) {
            if (phs[i].getos().equalsIgnoreCase(seOS) && phs[i].getp()>=50000){
                return phs[i];

            }
        }
        return null;
    }
}

class Ph{
    int pI;
    String os;
    String B;
    int p;


    public int getpI(){return pI;}
    public String getos(){return os;}
    public String getB(){return B;}
    public int getp(){return p;}

    public void setpI(int pI){this.pI=pI;}
    public void setos(String os){this.os=os;}
    public void setB(String B){this.B=B;}
    public void setP(int P){this.p=p;}

    public Ph(int pI,String os,String B,int p){
        this.pI=pI;
        this.os=os;
        this.B=B;
        this.p=p;
    }
}
