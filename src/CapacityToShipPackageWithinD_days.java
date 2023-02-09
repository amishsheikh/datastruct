public class CapacityToShipPackageWithinD_days {
    public static void main(String[] args) {
int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int b=5;
int ans =shipWithinDays(arr,b);
        System.out.println(ans);
    }

    static int shipWithinDays(int[] wt,int days){
        int max =0;
        int sum=0;

        for (int val: wt) {
            sum+=val;
            max = Math.max(max,val);
        }

        if (wt.length==days){
            return max;
        }

        int start=max;
        int end=sum;
        int ans =0;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (isPossible(wt, mid, days)){
                ans = mid;
                end=mid-1;
            }
            else{ //then you have to increase the load
                start=mid+1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] wt, int mid, int days) {
        int d=1;
        int sum=0;
        for (int i = 0; i < wt.length; i++) {
            sum +=wt[i];

            if(sum>mid){
                d++;
                sum=wt[i];
            }
        }
        return d<=days;
    }
}
