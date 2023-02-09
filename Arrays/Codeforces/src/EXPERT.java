import java.util.Scanner;

public class EXPERT {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for( int i=0; i<testcase; i++ ){
            float xxxxxx = sc.nextInt();
            float yyyyyyyyyyyy = sc.nextInt();
            if((yyyyyyyyyyyy/xxxxxx)*100 >= 50){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
