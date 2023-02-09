public class AreaOfRectangle {
    public static void main(String[] args) {
        Area rec = new Area();
        rec.length= 20;
        rec.breadth = 5;
        rec.getArea();
    }

}
class Area{
    int length;
    int breadth;

    public void getArea(){
        System.out.println(this.length*this.breadth);
    }
}
/*
Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
  method named as 'getArea' returns
the area of the rectangle. Length and breadth of rectangle are entered through keyboard
 */