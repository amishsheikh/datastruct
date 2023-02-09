public class Desc {
    public static void main(String[] args) {
        int[] arr = {10,8,7,6,5,4};
        int ans = BinaryDec(arr,7);
        System.out.println(ans);
    }

    static int BinaryDec(int[] arr,int n){
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
                end = mid-1;

            }else //ignoring second half
                start= mid+1;
        }
        return -1;
    }


}

