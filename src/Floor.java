public class Floor {
    public static void main(String[] args) {
        int[] arr  = {2,3,5,9,14,16,18};
        System.out.println(search(arr,19));
    }
//greatest number <= n
    static int search(int[] arr,int n){
        if(n>arr[arr.length-1]){
            return -1;
        }
        int start= 0;
        int end = arr.length-1;
//but what if the target element is the largest element then

        while (start<=end){
            int mid  = start+(end-start)/2;

            if(n<arr[mid]){
                end = mid -1;
            }
            else if (n>arr[mid]){
                start=mid+1;
            }
            else
                return mid;
        }

        return end;
    }
}
