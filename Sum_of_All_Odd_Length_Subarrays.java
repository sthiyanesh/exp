public class Sum_of_All_Odd_Length_Subarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int l = arr.length;
        for(int i = 0; i < l; i++){
            sum += (((i + 1) * (l - i) + 1) / 2) * arr[i];
        }
        return sum;
    }
}
