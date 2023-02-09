// https://leetcode.com/problems/remove-element/

public class RemoveElement {
    public static void main(String[] args) {
            int[] arr={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));
    }
    public static int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        while ( j < nums.length)
        {
            if (nums[j]!=val){
                nums[i]=nums[j];
                j++;
                i++;
            }
            else
                j++;
        }

        return i;
    }
}
