public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length>1){
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length-1;j++){
                    if(nums[j]==0&&nums[j+1]!=0){
                        nums[j]=nums[j+1];
                        nums[j+1]=0;
                    }
                }
            }
        }
    }
}
