public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        System.out.println(solution(arr, 'k'));

    }

   static char solution(char[] letters ,char target)
   {
       int start =0;
       int end =letters.length-1;

if (target> letters.length){
    return letters[start];
}
       while   (start   <=end ){
//           we get ans on this statement only
           int mid = start + (end-start)/2;


//           ignoring first half
           if (target <letters[mid]){
               end= mid-1;
           }else  {//ignoring second half
               start = mid+1;}

       }
       return letters[start]; // if no element is larger than target element this will give us starting index
//       you can also do this letters[start % letters.length] by removing the check
//       if (target> letters.length){
//    return letters[start];

   }
   }

