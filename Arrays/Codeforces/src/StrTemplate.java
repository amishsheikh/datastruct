import java.util.Scanner;

public class StrTemplate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        while (t-->0){
            int first = Integer.parseInt(in.nextLine());
            String s=String.valueOf(in.nextLine());
            String l=String.valueOf(in.nextLine());
            int[] c1=new int[26];
            int[] c2=new int[26];
            for (int i = 0; i < 26; i++) {
                c1[i]=c2[i]=0;
            }
            for(int i=0; i<first; i++){
                c1[s.charAt(i)-97]++;
                c2[l.charAt(i)-97]++;
            }

           int  ans=0;

            for(int i=0; i<26; i++){
                ans=Math.max(ans, Math.min(c1[i], c2[i]));
            }
            System.out.println(ans);
        }
    }

}
