
class Student3{
    String name ;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name+ " "+ age);
    }

//    This 3 function have same nam e but different functionality
}
public class Polymorphism {
    public static void main(String[] args) {
        Student3 s4= new Student3();
        s4.printInfo(21);
    }
}
