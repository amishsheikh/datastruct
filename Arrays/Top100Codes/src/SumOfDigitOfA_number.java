public class SumOfDigitOfA_number {
    public static void main(String[] args) {
        System.out.println(product(2,3));
        System.out.println(armstrong(370));
    }

    static int ans(int n){
        int sum = 0;
       while (n>0){
           int temp=n%10;
           sum=sum+temp;
           n=n/10;
       }
       return sum;
    }
// Palindrome number
    static boolean ans1(int n){
        int n1 =n;
        int sum = 0;
        while (n>0){
            int temp=n%10;
            sum=sum*10+temp;
            n=n/10;
        }

        if (sum==n1){
            return true;
        }
        else
            return false;
    }

//    Reverse of a number
static int ans2(int n){
    int sum = 0;
    while (n>0){
        int temp=n%10;
        sum=sum*10+temp;
        n=n/10;
    }
    return sum;
}

// square number
    static int product(int n,int x){
       int product=1;
        for (int i = 0; i < x; i++) {
            product=product*n;
        }
        return product;
    }

    static boolean armstrong(int n){
        int n1=n;
        int sum=0;
      int c=count(n);
       while (n>0){
           int temp=n%10;
           int add=product(temp,c);
           sum=sum+add;
            n/=10;
       }
       if (n1==sum)
           return true;
       else
           return false;
    }
    static int count(int n){
        int count =0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }


}
