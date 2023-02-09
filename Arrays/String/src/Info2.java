import java.util.Scanner;

public class Info2 {
    public static void main(String[] args) {
        Scanner  in  =new Scanner(System.in);
        String  s= in.next();
        String str = " ";
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)=='1')||(s.charAt(i)=='2')||(s.charAt(i)=='3')||(s.charAt(i)=='4')||(s.charAt(i)=='5')||(s.charAt(i)=='6')||(s.charAt(i)=='7')||(s.charAt(i)=='8')||(s.charAt(i)=='9')||(s.charAt(i)=='0')){
                str+=(s.charAt(i));
                sum=str.charAt(i)+sum;
            }

        }
        System.out.println(sum);
    }

}
