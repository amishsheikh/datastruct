import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            boolean swapped=false;  //by
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    swapped=true;
                    swap(arr,j,j-1 );
                }
            }
            if(!(swapped)){
                break;
            }
        }
    }


    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
