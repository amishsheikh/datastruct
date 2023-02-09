public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println();
        solution2(100);

    }

    static int solution(int n){
        if(n<=1){
            return n;
        }

        return solution(n-1)+solution(n-2);
    }

//    without using recursion
    static void solution2(int n){
      long num1=0;
        long num2=1;
        long count =0;
        long modulo=1000000007;
        while (count<=n){
            System.out.println((num1)%modulo+" ");
            long num3=num1+num2;
            num1=num2;
            num2=num3;
            count++;
        }
    }
}
