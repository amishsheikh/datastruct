// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

public class RemoveDuplicateFromSortedArray_II {
    public static void main(String[] args) {
    int[] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(ans(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for (int e:nums) {
            if(i==0 || i==1 || nums[i-2]!=e){
                nums[i]=e;
                i++;
            }
        }
        return i;
    }

    static int ans(int[] nums){
        int i=0;
        int j=0;
        while (j< nums.length){
            if (i==0 || i==1){
                nums[i]=nums[j];
                i++;
                j++;
            } else if (nums[i-2]!=nums[j]) {
                nums[i]=nums[j];
                i++;
                j++;
            }
            else
                j++;
        }
        return i;
    }
}
