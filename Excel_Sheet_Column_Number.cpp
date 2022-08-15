#include<iostream>
using namespace std;
class Excel_Sheet_Column_Number{
    public:
    int titleToNumber(string columnTitle) {
        string s=columnTitle;
        long long int cnt=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            cnt+=((int)s[n-1-i]-64)*pow(26,i);
        }
        return cnt;
    }
};