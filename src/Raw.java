public class Raw {
    public static void main(String[] args) {
        int[] arr = {1, 20, 30,34, 40, 10,2,1 };
        int ans  = search(arr,1);
        System.out.println(ans);
    }
//    public int solve(int[] A, int B) {
//
//    }
static int ans;
    static int search(int[] A,int B){
        int start =0;
        int end =A.length-1;
        int index=0;
        while (start<=end){
            int mid =  start+(end-start)/2;
            if(A[mid]>A[mid-1] && A[mid]>A[mid-1]){
                index=mid;
                break;
            } else if (B <A[mid]) {
                end =mid-1;
            }
            else
                start=mid+1;
        }
         ans =-1;
        BinaryAsec(A, B,0,index);
        BinaryDesec(A, B,index-1,A.length);
        return ans ;
    }

    static void BinaryAsec(int[] A,int B,int start,int end){



        while (start<=end){
            int mid =  start+(end-start)/2;
            if(A[mid]==B){
                ans=mid;
                break;
            } else if (B<A[mid]) {
                end =mid-1;
            }
            else
                start=mid+1;
        }

    }


    static void BinaryDesec(int[] A,int B,int start,int end){


        while (start<=end){
            int mid =  start+(end-start)/2;
            if(A[mid]==B){
                ans= mid;
                break;
            } else if (B<A[mid]) {
                start=mid+1;

            }
            else
                end =mid-1;
        }

    }
}
