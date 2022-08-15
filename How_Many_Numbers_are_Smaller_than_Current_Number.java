public class How_Many_Numbers_are_Smaller_than_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    cnt++;
                }
            }
            a[i]=cnt;
        }
        return a;
    }
}
