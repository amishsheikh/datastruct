// https://takeuforward.org/data-structure/remove-spaces-from-a-string/

public class RemoveAllTheSpaces {
    public static void main(String[] args) {
        String str = "Take you forward";
        System.out.println(ans(str));
    }

    static String ans(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                str=str.substring(0,i) +str.substring(i+1);
            }
        }
       return str;
    }
}
