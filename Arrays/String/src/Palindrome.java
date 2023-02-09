//https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not/

public class Palindrome {
    public static void main(String[] args) {
        String str = "aanaa";
        int n =121;
        pralindrome(n);
        palindrome(str);
    }
    static  void palindrome(String str){
       int n=str.length();
        String temp="";
        for (int i =n-1; i >=0 ; i--) {
           temp += str.charAt(i);

        }
        if (temp.equals(str)){
            System.out.println("p");
        }
        else
            System.out.println("no");
    }

    static  void pralindrome(int n1){
       String str = String.valueOf(n1);

        int n=str.length();
        String temp="";
        for (int i =n-1; i >=0 ; i--) {
            temp += str.charAt(i);

        }
        if (temp.equals(str)){
            System.out.println("p");
        }
        else
            System.out.println("no");
    }
}


//time complexity O(n)