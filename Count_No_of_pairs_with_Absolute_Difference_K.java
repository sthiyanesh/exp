public class Count_No_of_pairs_with_Absolute_Difference_K {
    public int countKDifference(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
