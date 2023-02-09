import java.util.Scanner;

public class TakeN_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input: ");
       int n = in.nextInt();
       int sum=n;
       while (n!=0){
           n= in.nextInt();
           sum+=n;;
       }
        System.out.println(sum);;

    }



}
