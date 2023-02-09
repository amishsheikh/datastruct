//write a program to check whether the give number is perfect square or not
public class SecondP {
    public static void main(String[] args) {
        System.out.println(perfectSquare(16));
    }

    public static boolean perfectSquare(int n){
        for (int i = 0; i <= Math.sqrt(n); i++) {
            if(i*i==n)
                return true;
        }
        return false;
    }
}
