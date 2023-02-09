import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,20,50,40,10};

        int ans = BinarySearch(arr,40);
        System.out.printf(String.valueOf(ans));
    }

    static int BinarySearch(int[] arr,int n){
       int start =0;
       int end =arr.length-1;
       int mid = start + (end-1)/2;

       while(start<=end){
//           we get ans on this statement only
           if (arr[mid]==n){
               return mid;
           }


//           ignoring first half
           if (arr[mid]<n ){
                start= mid+1;
           }else //ignoring second half
               end = mid-1;
       }
        return -1;
    }

}
