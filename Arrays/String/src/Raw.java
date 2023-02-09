public class Raw {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        System.out.println(ans(str));
    }

    static String ans(String str){
       StringBuffer a = new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            int ascii = (int) str.charAt(i);
            if((ascii>=60 && ascii<=90) || (ascii>=97 && ascii<=122)){ // by this statement only alphabet of the  is include in the a ,and we append the character of str into a
                a.append(str.charAt(i));
            }
        }
       return a.toString();
    }

}
