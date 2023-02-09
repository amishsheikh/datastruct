public class Three {
    public static void main(String[] args) {
        int[] arr ={7,4,8,2,9};
        System.out.println(ans(arr));

    }

    static int ans(int[] arr){

        int j=1;
        int max=arr[0];
        int count=1;
        while (j< arr.length){
            if (arr[j]>max){
                max=arr[j];
                count++;
            }
            j++;
        }
        return count;
    }
}
