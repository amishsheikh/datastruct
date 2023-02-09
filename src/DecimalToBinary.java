public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(binary(13));
    }

    static int binary(int n){
        int sum=0;
        while (n>0){
            n=n/2;
            if (oddEven(n)){
                sum =sum*10;
            }
            else
                sum=sum*10+1;
        }
        return sum;
    }
    static boolean oddEven(int n){
        if (n%2==0){
            return true;
        }
        else
            return false;
    }
}
