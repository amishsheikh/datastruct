class Pen{
    String color;
    String type; // ballpoint gel

    public void write(){
        System.out.println("writing something.......");
    }

    public void printColor(){
        System.out.println(this.color); // this tell the function which object called him
    }
    public void printType(){
        System.out.println(this.type);
    }
}

class BinarySearch{
    int[] arr;
    int n;
    public int BinarySearch(int[] arr,int n){
        this.arr= arr;
        this.n=n;
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid= start+(end -start)/2;
            if (arr[mid]==n){
                return mid;
            }else if (arr[start]<end){
                start=mid+1;
            }
            else
                end =mid-1;
        }
        return -1;
    }
    public void result(){
        System.out.println(BinarySearch(this.arr,this.n));
    }
}
class  Swap{
    int a;
    int b;
   public void swap(int a,int b){
       int temp=a;
       a=b;
       b=temp;
       System.out.println("after swapping a:"+a+" "+ "after swapping b:"+b);
    }

    Swap(){ //  parameterized constructor :-passing the parameter

        this.a = a;
        this.b= b;
    }
}

class Student{
    int age;
    String name;
  int roll;
  String  phone_no;

  String address;

     public void info(){
         System.out.println(this.name);
         System.out.println(this.age);
         System.out.println(this.roll);
         System.out.println(this.phone_no);
         System.out.println(this.address);
     }
     Student(Student s3){ // copy constructor :-copies  the name and age of the s1 object
         this.name=s3.name;
         this.age= s3.age;
     }
     Student(){ // non parameterized constructor
         System.out.println("constructor called");
     }
}
class Student1{
    String name;
    int age;


    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student1(String name,int age){ //  parameterized constructor :-passing the parameter

        this.name = name;
        this.age= age;
    }
}
public class OOPs {
    public static void main(String[] args) {
        Pen pen1 =new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

//        creating second pen
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();


//       creating new object s1 from student class
        Student s1= new Student();
        s1.name = "amish";
        s1.age = 21;
        Student s3  =new Student(s1); // here we didn't define the properties of the s3 we just copy properties of s1
        s3.info();

//        calling parameterized constructor
        Student1 s2= new Student1("amish",21);
        s2.info();

        Swap a=new Swap();
        a.swap(5,10);
    }
}
