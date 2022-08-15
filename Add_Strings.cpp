#include<iostream>
#include<string>
using namespace std;
class Add_Strings{
    public:
    string addStrings(string num1, string num2) {
        string s="";
        int a = num1.length()-1;
        int b = num2.length()-1;
        int rem=0;
        int c;
        while(a>=0&&b>=0){
            c=(int)num1[a]-48+(int)num2[b]-48+rem;
            s = to_string(c%10) + s;
            rem = c/10;
            a--;
            b--;
        }
        while(a>=0){
            c=(int)num1[a]-48+rem;
            s = to_string(c%10) + s;
            rem = c/10;
            a--;
        }
        while(b>=0){
            c=(int)num2[b]-48+rem;
            s = to_string(c%10) + s;
            rem = c/10;
            b--;
        }
        if(rem>0){
            s = to_string(rem) + s;
        }
        return s;
    }
};