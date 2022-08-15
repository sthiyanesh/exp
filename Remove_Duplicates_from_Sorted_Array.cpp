#include<iostream>
#include<vector>
using namespace std;
class Remove_Duplicates_from_Sorted_Array {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()==0){return 0;}
        int temp = 0;
        int next = 1;
        for(int i=1;i<nums.size();i++){
            if(nums[temp]!=nums[i]){
                nums[next]=nums[i];
                next++;
                temp=i;
            }
        }
        return next++;
    }
};