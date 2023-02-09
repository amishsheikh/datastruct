import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
            int[] arr={10,9,8,7,11,4,5,1,3,2};

        System.out.println(Arrays.toString( sort(arr,0, arr.length-1)));
    }

    static int[] sort(int[] arr,int l,int r){ //left right
        if (l<r){
            int mid = l+(r-l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            sorted(arr,l,mid,r);
        }
        return arr;
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int i=l;
        int j=mid+1;
        int m=l;
        int[] b =new int[arr.length];
       while (i<=mid && j<=r){
           if (arr[i]<arr[j]){
               b[m++]=arr[i++];
           }else
               b[m++]=arr[j++];

       }

//       if (i>mid){ //if left array is empty do this  means do work in right array only
//           while (j<=r){
//               b[m]=arr[j];
//               m++;j++;
//           }
//       }else{
//           while (i<=mid){ //if right array is empty do this means do work in left array only
//               b[m]=arr[i];
//               m++;i++;
//           }
//       }

        for (;i<=mid;i++)
        {
            b[m++]=arr[i];
        }

        for (;j<=r;j++)
        {
            b[m++]=arr[j];
        }

//      copying the array
        for (int k= l; k <=r ; k++) {
            arr[k]=b[k];
        }
    }

    static void sorted(int[] arr,int l,int mid,int h){
        int i=l; //first list starting point
        int j=mid+1; //second list starting point
        int k=l; //new list starting point
        int[] new_arr=new int[arr.length] ;
        while (i<=mid && j<=h){
            if (arr[i]<arr[j]){
                new_arr[k++]=arr[i++];}
            else
                new_arr[k++]=arr[j++];
        }

        for (; i <=mid ; i++) {
            new_arr[k++]=arr[i];
        }
        for (; j <=h ; j++) {
            new_arr[k++]=arr[j];
        }

        for (int m = l; m <= h; m++) {
            arr[m]=new_arr[m];
        }
    }
}
