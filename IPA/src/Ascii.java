import java.util.Arrays;
import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        in.close();
      str=str.replace(";","");
      String[] strArray = str.split(" ");
      int[] result = new int[0];
      int count=0;
        for (int i = 0; i < strArray.length; i++) {
        boolean prime =isP(Integer.parseInt(strArray[i]));
        if(prime==true){
            result= Arrays.copyOf(result,result.length+1);
            result[result.length-1]=Integer.parseInt(strArray[i]);
            count++;
        }
        }
        Arrays.sort(result);
        System.out.println(result[result.length-2]+count);

    }

    public static boolean isP(int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
