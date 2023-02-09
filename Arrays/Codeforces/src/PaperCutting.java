import java.util.Scanner;

public class PaperCutting {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in = new Scanner(System.in);
            int test=in.nextInt();
            for (int i = 0; i < test; i++){

                int num = in.nextInt();
                int kark = in.nextInt();
                int count = (int) (Math.ceil(num/kark) * Math.ceil(num/kark));
                System.out.println(count);
            }
        }

}
