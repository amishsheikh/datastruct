import java.awt.image.ShortLookupTable;

public class SearchInRoatedArray {
    public static void main(String[] args) {
        int[] arr={120,130,40,50,90,100,110};
//        System.out.println(binarySearch(arr,90,0,arr.length-1));
        System.out.println(ans(arr,90));
    }

        static int ans(int[] arr,int k){
        int peak =peak(arr);
        int left=binarySearch(arr,k,0,peak);
        int right=binarySearch(arr,k,peak+1,arr.length-1);
        if (left==-1){
            return right;
        }
        else
            return left;
        }
    static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid =start+(end-start)/2;
            if(arr[start]<=arr[mid] && arr[end]<=arr[mid]){
                return mid;
            } else if (arr[end]<arr[start]) {
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }
    static int binarySearch(int[] arr,int k,int start,int end){

        while (start<=end){
            int mid =start +(end-start)/2;

            if(arr[mid]==k){
                return mid;
            }
            else if(arr[start]<k){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }
}
