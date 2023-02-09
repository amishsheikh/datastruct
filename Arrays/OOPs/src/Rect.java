import java.util.Scanner;

public class Rect {
    public static  void main(String[] args) {

        Scanner in =new Scanner(System.in);
        Areas[] rec  = new Areas[2];
        for(int i=0;i< rec.length;i++){
            rec[i]=new Areas(in.nextInt(),in.nextInt());
        }

    }



}
class Areas{
     int length;
     int breadth;



    public  Areas(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
}
    public void   getArea() {
        System.out.println(this.length*this.breadth);  ;
    }


}
