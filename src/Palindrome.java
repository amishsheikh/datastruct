public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solution(112121211));
    }

    static int reverse(int n){
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
      return sum;
    }
    static boolean solution(int n){
        if (reverse(n)==n){
            return true;
        }
        return false;
    }
}
