import java.util.Locale;
//https://takeuforward.org/data-structure/count-number-of-vowels-consonants-spaces-in-string/
public class Count_number_of_vowels_consonants_spaces_in_String {
    public static void main(String[] args) {
        String str ="Take u forward is Awesome";
        str.toLowerCase();
        System.out.println(str);
        ans(str);
    }

    static void ans(String str){
        str=str.toLowerCase();
        int n = str.length();
        int vowel=0;
        int space=0;
        int constant=0;

        for (int i = n-1; i >=0; i--) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='u' ||str.charAt(i)=='i'|| str.charAt(i)=='o'){
                vowel++;
            } else if (str.charAt(i)==' ') {
                space++;
            }
            else
                constant++;
        }
        System.out.println("vowel: "+vowel );
        System.out.println("space: "+space);
        System.out.println("constant: "+constant);


    }
}
