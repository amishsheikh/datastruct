import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in =new Scanner(System.in);
		int t= in.nextInt();
		while(t-->0){
		    int n =in.nextInt();
		    int k =in.nextInt();
		    int v= in.nextInt();
		    int[] arr=new int[n];
		    int sum =0;
		    for (int i=0;i<n;i++){
		        arr[i]=in.nextInt();
		        sum+=arr[i];
		    }
//			System.out.println(sum);
		   int result = fun(sum,v,n,k);
		   System.out.println(result);
		}
	}
	public static int fun(int sum,int v,int n ,int k ){
	  
	     for(int i=1;i<=v;i++){
			 int r= i+i+i;
			 int q=n+k;
			 double result= (sum+r)/q;
//			 System.out.println(result);
		        if(result==v)
		        	return i;
		    }
		    return -1;
	}
}
