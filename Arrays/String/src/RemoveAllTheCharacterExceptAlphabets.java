public class RemoveAllTheCharacterExceptAlphabets {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        System.out.println(ans(str));
    }

    static String ans(String str){
        StringBuffer ans  = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
         int ascii= (int) str.charAt(i); // ascii value

            if ((ascii >=65 && ascii<=90) || (ascii>=97 && ascii <=122)) {
                ans.append(str.charAt(i));
            }//if alphabets


        }
        return ans.toString();
    }
}
