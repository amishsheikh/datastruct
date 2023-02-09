public class Subtract {
    public static void main(String[] args) {
        int n =234;
        int result= product(234);
        System.out.println(result);
    }

    static int product(int n){
        int sum = 0;
        int pro = 1;
        while(n>0){
            int temp =n%10;
            pro = pro * temp;
            sum = sum + temp;
            n=n/10;
        }
        return pro-sum;
    }

}
