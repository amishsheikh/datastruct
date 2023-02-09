import java.util.Scanner;

public class SingleOperation2 {
    public static void main(String[] args) {
        try{
            //Your Solve
            Scanner in = new Scanner(System.in);
            int t= in.nextInt();

            for (int i = 0; i < t; i++) {
                int n= in.nextInt();
                String s= in.next();
                int foo = Integer.parseInt(s, 2);
                int min=foo^(int) Math.floor(  foo/(int) Math.pow(2,1));
                int ans =1;
                for (int j = 2; j <= n; j++) {
                    if ((foo^(int) Math.floor(  foo/(int) Math.pow(2,j)))<=min){
                        min=foo^(int) Math.floor(  foo/(int) Math.pow(2,j));
                        ans=j;
                    }
                }
                System.out.println(ans);
            }
        }catch(Exception e){
            return;
        }




    }
}
