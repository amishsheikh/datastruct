import java.util.Arrays;

public class PrintAllTheSubstring {
    public static void main(String[] args) {
        String str="abcad";
       print(str);
    }

    static void print(String str){
        String s="";
        for (int i = 0; i < str.length(); i++) {
            for (int j=i+1; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    s+=str.charAt(i);
                }
            }
        }
//        int n =str.length();
//        String[] s= {" "};
//        for (int i = 0; i <= n; i++) {
//            for (int j = i+1; j <=n ; j++) {
//
//                System.out.println(str.substring(i,j));
//            }
//        }
        System.out.println(s);

    }
}
