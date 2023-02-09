import java.util.Scanner;

public class VowCount {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        str.toLowerCase();

        System.out.println(str.length());
        int c=0;
        int v=0;
        int vowelCount = 0, consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a' && str.charAt(i) <='z'){
                if (str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                    vowelCount += 1;
                else
                    consonantCount += 1;
            }
        }

        System.out.println("Vowel count:" + vowelCount);
        System.out.println("Constant count:" + consonantCount);
    }
}
