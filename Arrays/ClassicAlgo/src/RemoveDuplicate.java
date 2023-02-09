import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,12,2,2,2,2,2,2,2};
        System.out.println(removeDuplicate(arr));
    }

    public  static  int removeDuplicate(int[] nums){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!(list.contains(nums[i-1])))
                list.add(nums[i] );
        }
        return list.size();
    }
}
