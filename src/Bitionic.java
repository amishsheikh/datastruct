public class Bitionic {
    public static void main(String[] args) {
        int[] arr = {1, 20, 30,34, 40, 10,2,1 };
        int ans  = Search(arr,1);
        System.out.println(ans);
    }
    static int ans;
    static int Search(int[] arr,int n){
        int start  =0 ;
        int end = arr.length;
        int index = 0;

        while (true)
        {
            int mid  = start + (end - start)/2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid+1]) {
                index=mid;
                break;
            }
            if (arr[mid-1]<arr[mid]){
                start=mid+1;
            }
            else {
                end = mid-1;
            }

        }
        ans =-1;
        BinarySearchAsec(arr,n,0,index);
        BinaryDec(arr,n,index,arr.length-1);
        return ans;
    }

    static void BinaryDec(int[] arr, int n, int start, int end){
         start =0;
         end =arr.length-1;

        while(start<=end){
//           we get ans on this statement only
            int mid  = start + (end - start)/2;
            if (arr[mid]==n){
                ans = mid;
                return ;
            }


//           ignoring first half
            if (arr[mid]<n ){
                end = mid-1;

            }else //ignoring second half
                start= mid+1;
        }

    }

    static void BinarySearchAsec(int[] arr,int n,int start,int end){
         start =0;
         end =arr.length-1;


        while(start<=end){
//           we get ans on this statement only
            int mid  = start + (end - start)/2;
            if (arr[mid]==n){
                ans= mid;
                return ;
            }
//           ignoring first half
            if (arr[mid]<n ){
                start= mid+1;
            }else //ignoring second half
                end = mid-1;
        }

    }
}
