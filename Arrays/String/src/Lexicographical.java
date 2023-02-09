import java.util.Scanner;

public class Lexicographical {
    public static void main(String[] args) {
//            String str="Java";
//        System.out.println(ans(str));
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i < t; i++) {
            int n= in.nextInt();
            String str= in.next();

            System.out.println(ans(str));
        }
    }

    static StringBuffer ans(String str) {
            StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) (char) (str.charAt(i));
            if(ascii==90){
                ans.insert(i,(char)65);
            }
            else if(ascii==122){
                ans.insert(i,(char)97);
            }
            else if(ascii>=65 && ascii<90 || ascii>=97 && ascii<122){
                ans.insert(i,(char)(ascii+1));
            }
        }
        return ans;
    }







    static String ans1(String str){
        StringBuffer ans =new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int)(str.charAt(i));
            if (ascii == 90)
                ans.insert(i,(char) (65));
            else if (ascii == 122) {
                ans.insert(i,(char) (97));
            }
            else if(ascii>=65 && ascii<90 || ascii>=90 && ascii<122){
                ans.insert(i,(char) (ascii+1));
            }

        }
        return ans.toString();
    }
}
