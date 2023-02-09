import java.util.Arrays;
import java.util.Scanner;
//https://www.codechef.com/START59D/problems/AUDIBLE
public class AudibleRange {
    public static void main(String[] args) {

      int x=0;
      int y=2;
      int z=4;
      y=x++ +z++;
      x=z+y;
      y=y-3;
      z=y++ + --x;
      y=z++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


}
static int  fun(int a) {
if(a>0)
    return (a+fun(a-3));
return 0;

}}
