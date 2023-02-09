// https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
//left sum=right sum;
public class Index {
    public static void main(String[] args) {
        int[] arr ={1,7,3,6,5,6};
        System.out.println(ans1(arr, arr.length));
    }
// O(n^2)
    static int ans(int[] nums,int n){
        for (int i = 0; i < n; i++) {
            int leftSum=0,rightSum=0;
            for (int j = 0; j < i ; j++) {
                leftSum+=nums[j]; //we are adding only j till i
            }
            for (int j = i+1; j <n ; j++) {
                rightSum+=nums[j]; // we are adding only j till n
            }
            if (leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
// Time complexity O(n)
    static int ans1(int[] arr,int n){
       int sum=0;
       int leftSum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i <n ; i++) {
        sum-=arr[i];
            if (sum==leftSum){
                return i;
            }
        leftSum+=arr[i];

        }
        return -1;
    }
}
