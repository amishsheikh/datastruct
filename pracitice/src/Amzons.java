import java.util.ArrayList;
import java.util.List;

public class Amzons {
    public static void main(String[] args) {

    }

    public static String getEncryptedNumber(List<Integer> numbers) {
        // Write your code here
        // String str=" ";
        // if(){

        // }

        while (numbers.size()!=2) {
            for (int i = 1; i < numbers.size(); i++) {
                numbers.add(i, (i + (i - 1)));
            }
            for (int i = 0; i < numbers.size(); i++) {
                int n = numbers.get(i) % 10;
                numbers.add(i, n);
            }
            getEncryptedNumber(numbers);
        }
        List<String> str=new ArrayList<>();

        return numbers.toString() ;
    }
}
