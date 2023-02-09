import java.util.Scanner;

public class NONegative {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<t; i++ ){
            int p=1;
            for (int j = 0; j <n ; j++) {
                arr[j]= in.nextInt();
            }
            for(int j=0;j<n;j++){
                p*=arr[j];
            }
            if(p>=0){
                System.out.println(0);
            }else
                System.out.println(1);

        }

//        while (t>0){
//            int p=1;
//            for(int j=0;j<n;j++){
//                p*=arr[j];
//            }
//            if(p>=0){
//                System.out.println(0);
//            }else
//                System.out.println(1);
//
//            t--;
//        }
    }
}
