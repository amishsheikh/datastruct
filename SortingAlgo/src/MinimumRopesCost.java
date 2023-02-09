import java.util.Arrays;

public class MinimumRopesCost {
    public static void main(String[] args) {
        long[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr, arr.length));
    }

    static long  minCost1(long arr[], int n)
    {
        // your code here
        long  x =arr.length-1;
        long count =0;
        Arrays.sort(arr);
        while(x>=0){
            int sum= (int) (arr[0]+arr[1]);
            for(int i=0;i<arr.length-1;i++){
                if(sum<=arr[i]){
                    arr[i]=sum;
                }
            }
            count+=sum;
            x--;
        }
        return count;
    }

    static long  minCost(long arr[], int n){

        int count =0;
        int i=1;
        while (n>=0&&i<= arr.length){
            Arrays.sort(arr);
            int sum= (int) (arr[i]+arr[i-1]);
            arr[0]=sum;
            count+=sum;
            n--;
            i++;
        }
        return count;
    }

//    static long minCost12(long arr[],int n){
//        int count =0;
//return long;
//    }
}
