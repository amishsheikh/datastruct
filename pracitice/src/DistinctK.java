public class DistinctK {
    public static void main(String[] args) {
        String[] str={"aaa","aa","a"};
        System.out.println(ans(str,3,1));
    }

    static String ans(String[] arr,int n,int k){
        String[] str=new String[k];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                }
                else
                    for (int l = 0; l <k ; l++) {
                        str[l]=arr[i];
                    }
            }
        }
            return str[k-1];
    }
}
