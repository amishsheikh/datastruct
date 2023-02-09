import java.util.Arrays;

public class FindFirstAndLastPositionOfTheTargetElement {
    public static void main(String[] args) {
int[] arr  ={1,2,3,3,3,4,4,5};
        System.out.println(Arrays.toString(solution1(arr, 3)));
    }

  static int[] solution1(int[] arr,int n){
        int[] ans  ={-1,-1};
        int first= search(arr,n,true);
        int second=search(arr,n,false);
        ans[0]=first;
        ans[1]=second;
        return ans;
  }


  static int search(int[] arr,int target,boolean firstIndex) {
      int ans = -1;
      int start = 0;
      int end = arr.length - 1;


      while (start <= end) {
//           we get ans on this statement only
          int mid = start + (end - start) / 2;
          if (target < arr[mid]) {
              end = mid - 1;

          } else if (target > arr[mid]) { //ignoring second half
              start = mid + 1;
          } else {
//              potential ans found
              ans = mid;
              if (firstIndex) {
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          }

      }
      return ans;
  }
//brute force approach with linear search

     static int[] solution(int[] arr, int target ) {
        int[]  ans={-1,-1} ;
         int start = 0;
         int end = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == target) {
                 start = i;
             }
         }
         for (int i = arr.length - 1; i >=0; i--) {
             if (arr[i] == target) {
                 end = i;
             }
         }


         ans[0]=start;
         ans[1]=end;
         return ans;

     }
}
