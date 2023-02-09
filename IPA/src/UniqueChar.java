import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.next();
        String str1 ="" ;
        for (int i = 0; i < str.length(); i++) {
            if(!str1.contains(Character.toString(str.charAt(i))))
                str1+=str.charAt(i);
        }

         System.out.println(str1);
    }


}
