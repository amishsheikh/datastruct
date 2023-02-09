// https://github.com/venkivijay/Java-Solutions-TCS-Xplore-Proctored-Assessment/blob/master/Space_Character_Count/Question.md

import java.util.Scanner;

public class ThirdIp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sc = in.nextLine();

        int countC = 0;
        int countS = 0;
        for (int i = 0; i < sc.length(); i++) {
            if (sc.charAt(i) == ' ') {
                countS++;
            }
                if (sc.charAt(i) != ' ') {
                    countC++;
                }
            }
        System.out.println("No of Space: " + countS);
        System.out.println("No of character: "+ countC);}}