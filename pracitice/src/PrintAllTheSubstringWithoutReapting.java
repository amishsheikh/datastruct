import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class PrintAllTheSubstringWithoutReapting {
    public static void main(String[] args) {
        String s="abcba";
        ans(s);
    }
    static void ans(String str){
        String  res="";
        boolean[] hash = new boolean[str.length()];

        int i=0;
        if(hash[str.charAt(i)]==false){
            hash[str.charAt(i)]=true;
            res+= str.charAt(i);
        }
        i++;
        System.out.println(res);
    }
}
