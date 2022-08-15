public class Decompress_Run_Length_Encoded_List {
    public int[] decompressRLElist(int[] nums) {
        int sum=nums[0];
        for(int i=2;i<nums.length;i+=2){
            sum+=nums[i];
        }
        int ar[] = new int[sum];
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                ar[k] = nums[i+1];
                k++;
            }
        }
        return ar;
    }
}
