import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
       while (t-->0){
           int first = in.nextInt();
           int second = in.nextInt();
           int third = in.nextInt();

           if (((first+second)%2!=0)||((third+second)%2!=0)||((first+third)%2!=0))
               System.out.println("yes");
           else
               System.out.println("no");
        }
    }
}
