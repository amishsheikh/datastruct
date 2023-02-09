public class Merge {
    public static void main(String[] args) {

    }

    static void sort(int[] arr,int l,int r){
        if (l<r){
            int mid=l+(r-l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    static void merge(int[] arr,int l,int mid,int r){
        int i=l;int j=mid+1;int k=l;
        int[] arr1=new int[arr.length];
        while (i<=mid&&j<=r){

        }
    }
}
