#include<iostream>
#include<vector>
using namespace std;
class Shuffle_String{
    public:
    string restoreString(string s, vector<int>& indices) {
        string s1=s;
        for(int i=0;i<indices.size();i++){
            s1[indices[i]]=s[i];
        }
        return s1;
    }
};