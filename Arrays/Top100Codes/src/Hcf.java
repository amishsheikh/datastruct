public class Hcf {
    public static void main(String[] args) {

        System.out.println(soln(36,60));
    }

    public static int soln(int n,int n1){
        for (int i = n; i > 1; i--) {
            if(n%i==0&&n1%i==0)
            {
                return i;
            }
        }
        return 0;
    }
}
