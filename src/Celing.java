public class Celing {
    public static void main(String[] args) {
        int[] arr  = {2,3,5,9,14,16,18};
        System.out.println(search(arr,20));
    }
//smallest number >=n
    static int search(int[] arr,int n){
        int start =0;
        int end =arr.length-1;


          if(n>arr[arr.length-1]){
                    return -1;
                }
        while   (start   <=end ){
//           we get ans on this statement only
            int mid = start + (end-start)/2;
//           ignoring first half
            if (n <arr[mid]){
                end= mid-1;
            }else if(n>arr[mid]) {//ignoring second half
                start = mid+1;}
            else
                return mid;
        }
        return start;
    }
    }

