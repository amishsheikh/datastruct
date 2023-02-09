import java.util.HashSet;
import java.util.Scanner;
//https://www.codechef.com/START59D/problems/HAPPYSTR?tab=statement
public class Substring {


    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                String str = in.next();
                findSubstring(str);

            }




            }
    static boolean isVowel(char x) {
        // Function to check whether a character is
        // vowel or not
        return (x == 'a' || x == 'e' || x == 'i'
                || x == 'o' || x == 'u');
    }

    // Function to FindSubstrings of string
    static void findSubstring(String str) {
//        HashSet<Character> hash = new HashSet<Character>();
//        // To store vowels
//
//        int start = 0;
//        for (int i = 0; i < str.length(); i++) {
//            // If current character is vowel then
//            // insert into hash ,
//            if (isVowel(str.charAt(i)) == true) {
//                hash.add(str.charAt(i));
//
//                // If all vowels are present in current
//                // substring
//
//            }

        String str1 = " ";
        int count=0;
        for (int i = 3; i < str.length(); i++) {
            if (isVowel(str.charAt(i))&&isVowel(str.charAt(i-1))&&isVowel(str.charAt(i-2))) {
                count=count+3;
            }
        }
        if (count>2)
            System.out.print("Happy");
        else {
            System.out.println("Sad");
        }


    }
    }

