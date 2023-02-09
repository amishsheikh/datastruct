import java.util.Scanner;

public class ShirtSize {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
            int t = in.nextInt();


            for(int i=0;i<t;i++){
                String a= in.next();
                String b= in.next();
                int lawd=0,chuuu=0;
                int n=a.length();
                int m=b.length();
                for(int j=0;j<n;j++){
                    if(a.charAt(j)=='X'){
                        lawd++;
                    }
                }
                for( int jo=0;jo<m;jo++){
                    if(b.charAt(jo)=='X'){
                        chuuu++;
                    }
                }if(a.charAt(n-1)=='M'&&b.charAt(m-1)=='M'){
                    System.out.println('=');
                }
                else if(a.charAt(n-1)=='L'&&(b.charAt(m-1)=='M'||b.charAt(m-1)=='S')){
                    System.out.println('>');
                }else if(b.charAt(m-1)=='L'&&(a.charAt(n-1)=='M'||a.charAt(n-1)=='S')){
                    System.out.println('<');
                }else if(a.charAt(n-1)=='M'&&(b.charAt(m-1)=='S')){
                    System.out.println('>');
                }else if(b.charAt(m-1)=='M'&&(a.charAt(n-1)=='S')){
                    System.out.println('<');
                }else if(a.charAt(n-1)=='L'&&(b.charAt(m-1)=='L')){
                    if(lawd>chuuu)
                        System.out.println('>');
                    else if(lawd<chuuu)
                        System.out.println('<');
                    else
                    System.out.println('=');


                }else if(a.charAt(n-1)=='S'&&(b.charAt(m-1)=='S')){
                    if(lawd>chuuu)
                        System.out.println('<');
                    else if(lawd<chuuu)
                        System.out.println('>');
                    else
                        System.out.println('=');


                }

            }
        }
    }

