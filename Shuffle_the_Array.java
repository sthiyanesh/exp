public class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int num[] = new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            num[k]=nums[i];
            k++;
            num[k]=nums[n+i];
            k++;
        }
        return num;
    }
}
