import java.util.Scanner;

public class SECOND {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str= in.next();

        System.out.println(ans(str));

    }

    static int ans(String str){
        int hashtag=0;
        int star=0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)=='#'){
                hashtag++;
            }
            else
                star++;
        }
//
        return star-hashtag;
    }

}
