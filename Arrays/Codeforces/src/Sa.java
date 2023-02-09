import java.util.Arrays;

import java.util.Scanner;

public class Sa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  =in.nextInt();
        while (n-->0){
            int s = in.nextInt();
            int[] arr =new int[s];
            int[] arr1= new int[s];
            for (int i = 0; i < s; i++) {
                arr[i]= in.nextInt();

            }
            for (int i = 0; i < s; i++) {
                arr1[i]= arr[i];

            }
            Arrays.sort(arr1);
            for (int i = 0; i <s; i++) {
                if (arr[i]==arr1[arr1.length-1]){
                    arr[i]= arr1[arr1.length-1]-arr1[arr1.length-2];
                    System.out.print(arr[i]+" ");
                }
                else {
                    arr[i]=arr[i]-arr1[arr1.length-1];
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
    }


}
}
