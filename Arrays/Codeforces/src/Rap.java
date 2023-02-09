import java.util.*;

public class Rap {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        while (t-->0){
            long n = Integer.parseInt(in.nextLine());
            String s=String.valueOf(in.nextLine());
            Map<Character, Integer> d = new HashMap<Character, Integer>();
            if (n%2==1){
                System.out.println("no");
            }else {
                for(int i = 0; i < s.length(); i++)
                {
                    if(d.containsKey(s.charAt(i)))
                    {
                        d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
                    }
                    else
                    {
                        d.put(s.charAt(i), 1);
                    }
                }
                int temp=0;
                for (int i = 0; i <d.size(); i++) {

                    if(d.get(s.charAt(i)) != 0){
                        if (d.get(s.charAt(i))%2==1){
                            temp=1;
                            System.out.println("no");
                            break;
                        }
                    }

                }
                if (temp==0){
                    System.out.println("yes");
                }
            }

        }
    }
}
