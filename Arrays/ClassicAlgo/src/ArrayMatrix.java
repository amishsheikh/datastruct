import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]= in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i]= in.nextInt();
        }
         int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            int temp=0;
            int xor=0;
            for (int j = 0; j < n; j++) {
                temp =arr1[i]+arr2[j];
                xor=xor^temp;
            }
            arr3[i]=xor;
        }
        int xor=0;
        for (int i = 0; i < n; i++) {
            xor=xor^arr3[i];
        }
        System.out.println(xor);
    }
}

//npm install -g react-native-cli @react-native-community/cli
