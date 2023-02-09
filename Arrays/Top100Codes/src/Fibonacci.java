public class Fibonacci {
    public static void main(String[] args) {
       ans(10);
//       ans1(10);
        System.out.println();
       ans2(10);
        System.out.println();
        System.out.println( fib(10));
    }

    static void ans(int n){
        int a=0;
        int b=1;
        System.out.print(a+ " "+ b+" ");
        int product;
        for (int i = 2; i <n ; i++) {
            product=a+b;
            a=b;
            b=product;
            System.out.print(product+" ");
        }
    }
// using recursion

    static int ans1(int n){
        int a=0;
        int b=1;
        System.out.print(a+ " "+ b+" ");
        if (n>0){
            int prouduct= a+b;
            a=b;
            b=prouduct;
            System.out.println(prouduct+" ");
            ans1(n-1);
        }
        return 0;
}

        static int fib(int n){
            if (n<=1){
                return n;
            }
            return fib(n-1)+fib(n-2);
        }

//          fib(5)
//                     /                \
//               fib(4)                fib(3)
//             /        \              /       \
//         fib(3)      fib(2)         fib(2)   fib(1)
//        /    \       /    \        /      \
//  fib(2)   fib(1)  fib(1) fib(0) fib(1) fib(0)
//  /     \
//fib(1) fib(0)
//Optimized tree for recursion for code above
//
//    fib(5)
//
//    fib(4)
//
//    fib(3)
//
//    fib(2)
//
//    fib(1)



        static void ans2(int n){
            int[] f = new int[n+1];
            f[0]=0;
            f[1]=1;
            System.out.print(f[0]+" "+f[1]+" ");
            for (int i = 2; i < n; i++) {
                    f[i]=f[i-1] + f[i-2];
                System.out.print(f[i]+" ");
            }
        }

//    General Formula to find the Nth term of a Series
//F0 = 0 and F1 = 1 be the seed values
//The Nth term of a Fibonacci series is given as Fn = Fn-1 + Fn-2 .
//Example,
//Input : 5
//Fibonacci Series : 0 1 1 2 3
//Explanation:
//For 3rd term it's 2nd term + 1st term.
//For 4th term it's 3rd term + 2nd term.
//for 5th term it's 4th term + 3rd term.
}
