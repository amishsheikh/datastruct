import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n= in.nextInt();
//        if (n>1||n<100){
//            System.out.println("NO");
//        }
        if(n%2==0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }

}
