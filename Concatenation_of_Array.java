public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int a[] = new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            a[i] = nums[i%nums.length];
        }
        return a;
    }
}
