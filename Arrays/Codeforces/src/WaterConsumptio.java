import java.util.Scanner;

public class WaterConsumptio {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n= in.nextInt();
            String str = in.next();
            int mid =n/2;
         int  c=0;
           int i =0 ;
           while (mid<n){
               if (str.charAt(i++)==str.charAt(mid++)){
                   c++;
               }


           }

            if (c==n/2)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
