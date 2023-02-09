import java.util.Arrays;

public class KthMissingPostiveNo {
    public static void main(String[] args) {
                int[] arr={2,3,4,7,11};
        System.out.println(Arrays.toString(ans(arr, 5)));
    }

    static int[] ans(int[] arr,int k){
        int n= arr.length;
        int[] New_arr= new int[arr[n-1]*2];
        int i=0;
        for (int j = 1; j < k ; j++) {
            if(arr[i]!=j){
                New_arr[i]=j;
                i++;
            }
        }

        return New_arr;
    }
    static int search(int[] arr,int k){
        int s=0;
        int e= arr.length-1;
        while (s<=e){
            int mid =s+(e-s)/2;
            if (arr[k]<mid){
                s=mid+1;
            }
            else if(arr[k]>mid){
                e=mid-1;
            }
            else
               return mid;
        }
        return -1;
    }
}
