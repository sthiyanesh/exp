public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int[] a = new int[26];
        for(int i=0;i<s.length();i++){
            a[(int)s.charAt(i)-97]++;
        }
        for(int i=0;i<s.length();i++){
            if(a[(int)s.charAt(i)-97]==1)
                return i;
        }
        return -1;
    }
}
