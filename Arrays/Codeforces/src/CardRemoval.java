import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardRemoval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testty = in.nextInt();
        for (int i = 0; i < testty; i++) {
            int number  = in.nextInt();
            int[] arr = new int[number ];
            for (int j = 0; j < number ; j++) {
                arr[j] = in.nextInt();
            }
            int k = mosdbjsadhfs(arr,number );
            System.out.println(number -k);
        }
    }


    static int mosdbjsadhfs(int arr[], int n)
    {

        // Insert all elements in hash
        Map<Integer, Integer> dell =
                new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++)
        {
            int unique = arr[i];
            if(dell.containsKey(unique))
            {
                int frequencide = dell.get(unique);
                frequencide++;
                dell.put(unique, frequencide);
            }
            else
            {
                dell.put(unique, 1);
            }
        }
        int max = 0;

        for(Map.Entry<Integer, Integer> val : dell.entrySet())
        {
            if (max < val.getValue())
            {

                max = val.getValue();
            }
        }

        return  max;
    }


}