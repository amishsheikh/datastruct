public class ReverseString {
    public static void main(String[] args) {
        String str = "I am IRON MAN";
        System.out.println(ans(str));
    }

    static String ans(String str){
        int n= str.length();
        StringBuffer a=new StringBuffer();
        for (int i = n-1; i >0 ; i--) {
            a.append(str.charAt(i));
        }
        return a.toString();
    }
}
