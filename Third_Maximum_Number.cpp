#include<iostream>
#include<vector>
using namespace std;
class Third_Maximum_Number{
    public:
    int thirdMax(vector<int>& nums) {
       long long int max1=-2147483649,max2=-2147483649,max3=-2147483649;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2&&nums[i]!=max1){
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>max3&&nums[i]!=max1&&nums[i]!=max2){
                max3=nums[i];
            }
        }
        if(max3==-2147483649)
            return ((int) max1);
        return ((int)max3); 
    }
};