import java.util.Arrays;

public class Number {
    public static void main(String[] args) {
int[] arr = {3,3,3};
        System.out.println(findGCD(arr));
    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int Gcd =gcd(nums[0],nums[nums.length-1]);
       return Gcd;
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;

        return gcd(b,a%b);
    }
}
