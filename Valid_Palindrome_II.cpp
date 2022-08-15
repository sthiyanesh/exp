#include<iostream>
using namespace std;
class Valid_Palindrome_II{
    private:
    bool checkPalindrome(string s,int k){
        int i=0,j=s.length()-1;
        while(i<j){
            if(i==k)
                i++;
            if(j==k)
                j--;
            if(s[i]!=s[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
    public:
    bool validPalindrome(string s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s[i]!=s[j])
                return checkPalindrome(s,i)||checkPalindrome(s,j);
            i++;
            j--;
        }
        return true;
    }
};