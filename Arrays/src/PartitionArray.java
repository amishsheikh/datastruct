// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/

public class PartitionArray {
    public static void main(String[] args) {
        int[] arr={1,-1,1,-1};
        System.out.println(canThreePartsEqualSum(arr));
    }

    public static  boolean canThreePartsEqualSum(int[] arr) {
        int n= arr.length;
int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0)
            return false;
        for (int i = 0; i < n; i++) {
             sum=0;
            int leftSum=0;
            int rightSum=0;
            int count =0;
            for (int j = 0; j <= i; j++) {
                sum+=arr[j];
            }

            for (int j=i+1;j<n;j++){
                leftSum+=arr[j];
                if (leftSum==sum){
                    if (count+i+2==n){
                        return false;
                    }
                    for (int k = count+i+2; k <n ; k++) {
                        rightSum+=arr[k];
                    }

                    if (rightSum==sum){
                        return true;
                    }
                }
                count++;
            }

        }
        return false;
    }


}
