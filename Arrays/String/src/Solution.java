class Solution{
    public long solve(int N, int Par[], int Arr[], int K, int A, int B){
        // Code Here.
        long ansnweree=0;
        int[] zryatrstyr=new int[N];
        for(int i=0;i<N;i++){
            zryatrstyr[i]=Arr[i];
        }
        for(int i=0;i<N;i++){
            if(zryatrstyr[i]>K){
                if(A<=B){
                    ansnweree+=A;
                    zryatrstyr[Par[i]]+=zryatrstyr[i];
                    zryatrstyr[i]=0;
                }
                else{
                    ansnweree+=B;
                    zryatrstyr[i]=0;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(zryatrstyr[i]>K){
                ansnweree+=B;
            }
        }
        return ansnweree;}}