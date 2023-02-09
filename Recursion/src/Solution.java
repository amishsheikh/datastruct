class Solution {
    public static int countPrimes(int n) {
        int count =1;

        if(n==0 || n==1){
            return 0 ;
        }
        for (int i = 2; i <n ; i++) {
            boolean s = false;

            for (int j = 2; j < i; j++) {
                if(i%j==0){
                s=true;
                }
                if (s){
                    count++;
                }
            }
        }

        return count; 
    }


    public static void main(String[] args) {
        System.out.println( countPrimes(10));
    }
}