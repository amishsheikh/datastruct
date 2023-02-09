// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;

public class Remove_duplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        int j =1 ;
        while (j< nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else {
                i++;
                nums[i]=nums[j];
            }
        }

       return i+1;
    }
}
