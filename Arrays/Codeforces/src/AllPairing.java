import java.util.Arrays;

public class AllPairing {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 3};
        int[] nums2 = {10, 2, 5, 0};
//        System.out.println(max_xor(nums1, nums2));
    }
//    static int max_xor(int arr[],int[] arr1 ,int n) {
//        int maxx = 0, mask = 0;
//
//        HashSet<Integer> se = new HashSet<Integer>();
//
//        for (int i = 30; i >= 0; i--) {
//
//            // set the i'th bit in mask
//            // like 100000, 110000, 111000..
//            mask |= (1 << i);
//
//            for (int j = 0; j < n; ++j) {
//
//                // Just keep the prefix till
//                // i'th bit neglecting all
//                // the bit's after i'th bit
//                se.add(arr[j] & mask);
//            }
//
//            int newMaxx = maxx | (1 << i);
//
//            for (int prefix : se) {
//
//                // find two pair in set
//                // such that a^b = newMaxx
//                // which is the highest
//                // possible bit can be obtained
//                if (se.contains(newMaxx ^ prefix)) {
//                    maxx = newMaxx;
//                    break;
//                }
//                se.clear();
//            }
//
//        }
//        return maxx;
//    }
//
}