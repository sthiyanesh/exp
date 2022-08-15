#include<iostream>
using namespace std;
class Arranging_Coins{
    public:
    int arrangeCoins(int n) {
        long long int sum=1;
        int i=1;
        while(sum<n){
            i++;
            sum+=i;
        }
        if(sum==n)
            return i;
        return i-=1;
    }
};