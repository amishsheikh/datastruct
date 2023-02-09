import java.util.Scanner;

public class Ch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s = in.nextLine();
        String str =" ";
        for (int i = 1; i <=s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i-1)) && !Character.isDigit(s.charAt(i-1)) && Character.isWhitespace(s.charAt(i)))
                str+=s.charAt(i-1);
        }
        System.out.println(str);
    }
}
