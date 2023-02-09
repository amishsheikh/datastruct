public class SmallerOrEqual {
//    https://www.interviewbit.com/problems/smaller-or-equal-elements/
    public static void main(String[] args) {
int[] arr={1, 6, 9, 13, 15, 18, 20, 25, 29, 32, 35, 46 };
        System.out.println(search(arr,28));
    }
    static int search(int[] arr,int B){
        int count =0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]<=B){
                count++;
            }
        }
        return count;
    }

}
