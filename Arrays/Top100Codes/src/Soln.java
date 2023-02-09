import java.util.Scanner;

public class Soln {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(find(n1,n2));
    }

    private static int find(int n1, int n2) {

        int count =0;
        boolean[] visited = new boolean[10];
        for (int i = n1; i <=n2 ; i++) {
            int num= i ;
            while (num>0){
                if (visited[num%10]==true)
                    break;
                visited[num%10]=true;
                num/=10;
            }
            if (num==0)
                count++;
        }
        return  count;
    }


}
