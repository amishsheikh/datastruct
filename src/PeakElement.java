public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 20, 30, 40, 10,2,1 };
        int ans  = search(arr);
        System.out.println(ans);
    }
//question name find the peak element or mountain element

    static int search(int[] arr){
        int start  =0 ;
        int end = arr.length;
        int index = 0;

        while (true)
        {
            int mid  = start + (end - start)/2;
//            for moving array from middle element to get the two sorted array ascending and descending
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

        return index;
    }
}
