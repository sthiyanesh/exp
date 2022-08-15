#include<iostream>
using namespace std;
class Largest_Odd_Number_in_String{
    public:
    string largestOddNumber(string num) {
        int i;
        for(i=num.length()-1;i>=0;i--){
            if(((int)num[i]-48)%2==1)
                break;
        }
        return num.substr(0,i+1);
    }
};