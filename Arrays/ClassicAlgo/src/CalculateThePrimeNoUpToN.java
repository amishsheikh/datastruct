// question based on SieveOfEratosthenes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CalculateThePrimeNoUpToN {
    public static void main(String[] args) {
//        System.out.println( sieveOfEratosthenes1(10));;
//        System.out.println(sieveOfEratosthenes(9));
        int[] nums = {2,1,-1};
        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(pivot(nums));
    }

    static ArrayList<Integer> sieveOfEratosthenes1(int N){
        // code here
        ArrayList<Integer> list =new ArrayList<>();
        boolean[] prime = new boolean[N];
        for (int i = 2; i *i<N ; i++) {

            if(!prime[i]){
                for (int j = i; j*i <N ; j++) {
                    prime[j*i]=true;
                }

            }

        }

        for (int i = 2; i < N; i++) {
            if(!prime[i]){
                list.add(i);
            }
        }
        return  list;
    }


    public static int[] runningSum(int[] nums) {

        int[] arr =new int[nums.length];
        arr[0]= nums[0];
        for (int i = 1; i < nums.length; i++) {
            int sum = nums[0];
            for (int j = 1; j <= i; j++) {
                sum=sum+nums[j];
            }
            arr[i]=sum;
        }
        return arr;
    }

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int pivot=0;
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rigthSum = 0 ;
            for (int j = pivot+1; j <n ; j++) {
                rigthSum= rigthSum+nums[j];
            }
            for (int j = 0; j < pivot ; j++) {
                leftSum = leftSum+nums[j];
            }
            if (rigthSum==leftSum)
                return pivot;
            else
                pivot++;
        }

        return -1;
    }

//     o(n) time complexity algo
    static  int pivot(int[] nums){

        int sum = IntStream.of(nums).sum();
        int lefSum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum-nums[i]-lefSum;
            if (rightSum == lefSum){
                return i;
            }
            lefSum +=nums[i];
        }
        return -1;
    }
}
