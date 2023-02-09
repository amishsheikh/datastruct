import java.util.ArrayList;

public class SumMaximumSubarraay {
    public static void main(String[] args) {
      int[ ] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max(arr));
        System.out.println(prime(10));
    }

    static int max(int[] arr){
        int max= Integer.MIN_VALUE;
        int currsum=0;
        for (int num:arr){
            currsum =Math.max(num,currsum+num);
            max=Math.max(currsum,max);
        }
        return max;
    }

    static ArrayList<Integer>  prime(int n){
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n];
        prime[0]=true;
        prime[1]=true;
        for (int i = 2; i*i <n ; i++) {
            if (!prime[i]){
            for (int j = 2; j*i <n ; j++) {
                    prime[j*i]=true;
            }}
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!prime[i])
               list.add(i);
        }
        return list;
    }
}
