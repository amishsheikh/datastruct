public class sortCharacter {
    public static void main(String[] args) {
        String str ="dbc";
        System.out.println(ans(str));
    }

    static void swap(char a,char  b){
        char temp =a ;
        a=b;
        b=temp;
    }

//    static String ans1(String str){
//       StringBuffer ans = new StringBuffer();
//        for (int i = 0; i < str.length(); i++) {
//            int ascii=(int)(char)str.charAt(i);
//            if (ascii>ascii+i){
////                swap(ascii,ascii+i);
////                ans.;
//            }
//        }
//    }


    static String ans(String str){
        char[] ch= str.toCharArray();
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = 0; j < str.length()-i-1 ; j++) {
                if (ch[j]>ch[j+1]){
                    char temp =ch[j];
                   ch[j]=ch[j+1];
                   ch[j+1]=temp;
                }
            }
        }
        String result = new String(ch);
        return result;
    }

    public static String solve(String str, int n) {
        char[] arr = str.toCharArray();
        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // swap
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String ans = new String(arr);
        return ans;
    }
}
