import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int testcase= in.nextInt();
        for (int i = 0; i <testcase ; i++) {
            int first = in.nextInt();
            int second = in.nextInt();
            int third = in.nextInt();
              if (first+second==third||first+third==second||second+third==first){
                  System.out.println("yes");
              }else
                  System.out.println("no");
        }
    }
}
