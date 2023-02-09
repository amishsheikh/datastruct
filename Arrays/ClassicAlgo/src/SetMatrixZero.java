import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter row and column:");
        int row  = in.nextInt();
        int column = in.nextInt();

        int[][] arr=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        setZero(arr);
    }

    public static void setZero(int[][] matrix)
    {
        int row= matrix.length;
        int column= matrix[0].length;
        int[][] arr =new int[row][column];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j]=matrix[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j]==0){
                    helper(i,j,matrix);
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void helper(int a,int b,int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[a][i]=0; //row element zeros
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][b]=0; //column element zeros
        }
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character , Character> map1 = new HashMap<>();
        HashMap<Character , Boolean> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1.containsKey(ch1)==true){
                if (map1.get(ch1)!=ch2)
                    return false;
            }
            else {
                if (map2.containsKey(ch2)==true){
                    return false;
                }
                else{
                    map1.put(ch1,ch2);
                    map2.put(ch1,true);
                }
            }
        }
        return true;
    }
}
