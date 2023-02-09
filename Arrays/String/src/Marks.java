import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                 System.out.println("Enter the marks ");
                int n=sc.nextInt();


                System.out.println("stop 0");
                int i=sc.nextInt();
        ans(n,i);


    }

    static void ans(int n,int i){
        if (n==0){
            System.out.println("marks are not good");
        }

        while (i!=0){
            if (n>=90){
                System.out.println("Marks are good ");
            } else if (n>=60) {
                System.out.println("Do better ");
            }
            else
                System.out.println("Marks are poor");
        }
    }
}
