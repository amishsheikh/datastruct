import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter two input : ");
        int n = in.nextInt();
        int b= in.nextInt();
        System.out.println("before swapping n:"+n+ " "+"before swapping b:"+b);
        Swap a = new Swap();
        a.swap(n,b);
        int[] arr  = {1,2,3,4,5};
        BinarySearch s= new BinarySearch();
        System.out.println(  s.BinarySearch(arr, 3));

    }
}
