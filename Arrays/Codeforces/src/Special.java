import java.util.Scanner;

//https://www.codechef.com/START59D/problems/SPECIALITY
public class Special {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0; i<t;i++ ){
            int x=in.nextInt();
            int y=in.nextInt();
            int z=in.nextInt();
            int m=Math.max(x,Math.max(y,z));
            if (m==x){
                System.out.println("Setter");
            } else if (m==y) {
                System.out.println("Tester");
            }
            else
                System.out.println("Editorialist");
        }
    }
}
