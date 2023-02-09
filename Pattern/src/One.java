public class One {
    public static void main(String[] args) {
//        System.out.println("1");
//        one(5);
//        System.out.println("2");
//        two(5);
//        System.out.println("3");
//        three(5);
//        System.out.println("4");
//        four(5);
//        System.out.println("5");
        five(5);
//        System.out.println("6");
//        six(5);
//        System.out.println("7");
//        seven(5);
//        System.out.println("8");
//        eight(5);
//        System.out.println("9");
//        nine(5);
//        System.out.println("10");
//        ten(5);
//        System.out.println("11");
        eleven(5);
//        System.out.println("12");
        tweleve(5);
    }

    static void one(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void two(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void three(int n){
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void four(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void five(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void six(int n){

        for (int i = 0; i <= n; i++) {
            for (int k = n-i; k >0 ; k--) {
                System.out.print(" ");
            }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    static void seven(int n){

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n-i; k >0 ; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    static void nine(int n){

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n-i; k >0 ; k--) {
                System.out.print("*");
            }


            for (int j = n*2-1; j >n+i ; j--) {
                System.out.print("*");
            }
            for (int j = n+i-1; j <n+i+i; j++) {
                System.out.print(" ");
            }


            System.out.println();
        }
    }

    static void eight(int n){

        for (int i = 0; i <n; i++) {
            for (int k = n-i; k >0 ; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = n+i-1; j <n+i+i; j++) {
                System.out.print("*");
            }
            for (int j = n*2-1; j >=n+i ; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    static void ten(int n){

        for (int i = 0; i <=n; i++) {
            for (int k = n-i; k >0 ; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }

//            for (int j = n+i-1; j <n+i+i; j++) {
//                System.out.print("*");
//            }
//            for (int j = n*2-1; j >=n+i ; j--) {
//                System.out.print(" ");
//            }

            System.out.println();
        }
    }

    static void eleven(int n){

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n-i; k >0 ; k--) {
                System.out.print("*"+" ");
            }




            System.out.println();
        }
    }

    static void tweleve(int n){

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n-i; k >0 ; k--) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        for (int i = 0; i <=n; i++) {
            for (int k = n-i; k >0; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        }

        static void thirteen(int n){

        }



}
