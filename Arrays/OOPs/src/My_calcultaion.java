public class My_calcultaion extends calculation {
    public void mul(int x,int y){
        z=x*y;
        System.out.println("Multiplication is:"+z);
    }

    public static void main(String[] args) {
        My_calcultaion ra = new My_calcultaion();
        int m =ra.add(5,6);

        ra.sub(5,6);
        System.out.println("Addition is:"+m);
        ra.mul(5,6);
        ra.div(5,6);
    }

}

    class calculation{
    int z;

        public  int add(int x,int y){
            z=x+y;
            return z;
        }

        public void sub(int x,int y){
            z=x-y;
            System.out.println("subtraction is:"+z);
        }
        public void div(int x,int y){
            z=x/y;
            System.out.println("Division is:"+z);
        }
    }
