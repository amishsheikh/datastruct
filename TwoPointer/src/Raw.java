import java.util.Scanner;

public class Raw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }


    }
}
//    static void sum(int n,int a,int b){
//        Scanner in =new Scanner(System.in);
//        int n= in.nextInt();
//        int a= in.nextInt();
//        int b= in.nextInt();
//        sum(n,a,b);
//    }

