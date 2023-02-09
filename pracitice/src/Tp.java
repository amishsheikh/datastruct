import java.util.Scanner;

public class Tp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A= sc.next();
        String B= sc.next();
        System.out.println(ans(A,B));

    }

    static String ans(String a,String b){
        String ans ="";
        for (int i = 0; i < b.length(); i++) {
            a = a.replace(b.charAt(i),' ');
        }
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i)==' '){
                a=a.substring(0,i) + a.substring(i+1);
            }
        }
        return a;
    }
}
