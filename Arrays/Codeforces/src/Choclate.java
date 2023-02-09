import java.util.Scanner;

public class Choclate {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int kjdbasbdh = in.nextInt();
        while (kjdbasbdh-->0){
            int dksdkanjskd= in.nextInt();
            int kjnajkzdbhahsbdkj= in.nextInt();
            if (dksdkanjskd*2>kjnajkzdbhahsbdkj*5){
                System.out.println("Chocolate");
            }
            else if (dksdkanjskd*2<kjnajkzdbhahsbdkj*5)
                System.out.println("Candy");
            else
                System.out.println("Either");
        }
    }
}
