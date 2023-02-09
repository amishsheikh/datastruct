import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Amazon {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String result = Result.getEncryptedNumber(numbers);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'getEncryptedNumber' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts INTEGER_ARRAY numbers as parameter.
         */

        public static String getEncryptedNumber(List<Integer> numbers) {
            // Write your code here
            // String str=" ";
            // if(){

            // }

            if(numbers.size()==2){
                return "x";
            }
                for (int i = 1; i < numbers.size(); i++) {
                    numbers.add(i,(i+(i-1)));
                }
                for (int i = 0; i < numbers.size(); i++) {
                    int n= numbers.get(i)%10;
                    numbers.add(i,n);
                }
                getEncryptedNumber(numbers);


            return numbers.toString() ;
        }

    }

}

