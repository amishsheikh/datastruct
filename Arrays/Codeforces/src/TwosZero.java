//public class TwosZero {
//   #include<bits/stdc++.h>
//            #define int long long
//    using namespace std;
//    int numberbfus, nahsgsfgejsgf, habsdvfwevs;
//    long long sware(long long bijssn, long long numberbfus) {
//        long long su=1;
//        while(numberbfus) {
//            if(numberbfus %2==1)su=su*bijssn%998244353;
//            bijssn=bijssn*bijssn%998244353;
//            numberbfus /=2;
//        }
//        return su;
//    }
//    long long countNumber(int i, int jo) {
//        return ((i/(1<<(jo+1)))<<jo)+(max(0ll,i%(1<<(jo+1))-(1<<jo)+1));
//    }
//    void solutino(){
//        cin >> numberbfus >> nahsgsfgejsgf;
//        habsdvfwevs =0;
//        for(int i=0;i<31;++i)
//            habsdvfwevs =(habsdvfwevs +(sware(countNumber(nahsgsfgejsgf,i), numberbfus)<<i)%998244353)%998244353;
//        cout << habsdvfwevs << endl;
//    }
//    signed main() {
//        int adhshd;cin >> adhshd;
//        while(adhshd--) solutino();
//    }
//}
