public class Number_of_1_Bits {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='1'){
                sum++;
            }
        }
        return sum;
    }
}
