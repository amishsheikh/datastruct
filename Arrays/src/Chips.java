//

public class Chips {
    public static void main(String[] args) {
           int[] arr = {2,2,2,3};
        System.out.println(minCostToMoveChips(arr));

    }
    public  static int minCostToMoveChips(int[] position) {

        int even=0;
        int odd=0;
        for (int i:position) {
           if(i%2==1)
               ++odd;
           else
               ++even;

        }
        return Math.min(odd,even);
    }
}
