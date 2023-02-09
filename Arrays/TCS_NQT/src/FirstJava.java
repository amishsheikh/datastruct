import java.util.Scanner;

public class FirstJava {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        while (n>0){
            int temp = n%10;
            sum+=temp;
            n/=10;
        }
        if (sum%3==0)
            System.out.println("True");
        else
            System.out.println("false");
    }
}
