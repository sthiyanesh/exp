import java.util.*;
public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int temp=1;
        int sum=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])
                temp++;
            else{
                sum=sum+(temp*(temp-1)/2);
                temp=1;
            }
        }
        sum=sum+(temp*(temp-1)/2);
        return sum;
    }
}
