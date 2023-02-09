public class Dec {
    public static void main(String[] args) {
        System.out.println(col(255));
    }

    public static int sol(int n){
        int i=0;
        int sum=0;
        while (n>0){
            int temp = n%10;
            sum+=temp*Math.pow(2,i);
            n=n/10;
            i++;
        }
        return sum;

    }
    public static int col(int n){
        int sum=0;
        while (n>0){
            int temp =n%2;
            sum=sum*10+temp;
            n/=2;
        }
        return sum;
    }
}
