import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
         return arr;
    }


}
