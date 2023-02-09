public class LargestWordInString {
    public static void main(String[] args) {
        String str="Doc Google Microsoft";
        System.out.println(ans(str));
    }

    static String ans(String str){
       int len =str.length();
       int i=0;
       int j=0;
       String maxWord ="";
       int maxLength=0;
       int maxStart=0;

       while (j<=len){ //j will run till the length
           if (j<len && str.charAt(j)!=' '){
               j++;
           }
           else {
               int currLength=j-i; //to find the actual current length - i
               if (currLength>=maxLength){
                   maxLength=currLength;
                   maxStart=i;
               }
               j++;
               i=j; // only i  is changing
           }
       }
       maxWord=str.substring(maxStart,maxLength+maxStart);
       return maxWord;
    }
}
