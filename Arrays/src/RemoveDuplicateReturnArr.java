import java.util.Arrays;

public class RemoveDuplicateReturnArr {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,2,2,2,2,2,22,29};
        System.out.println(Arrays.toString(ans(arr)));
    }

    static int[] ans(int[] arr){
        int i=0;
        int j=i+1;
        while (j< arr.length){
            if (arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
            arr[i]=arr[j] //here i and j are different that's why we are putting the j value in the i
            ;
            }
        }
        int[] newarr=new int[i+1];
        System.arraycopy(arr, 0, newarr, 0, newarr.length);
        return newarr;
    }
}
