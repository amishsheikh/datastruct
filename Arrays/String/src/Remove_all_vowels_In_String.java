//https://takeuforward.org/data-structure/remove-all-vowels-from-the-string/

public class Remove_all_vowels_In_String {
    public static void main(String[] args) {
        String str ="Take u forward is Awesome";

        System.out.println(str);
        System.out.println(RemoveVowels(str));
    }

    public static String RemoveVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i)==' ') {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        return str;
    }
}
