public class Find_the_Difference {
    public char findTheDifference(String s, String t) {
        int a[] = new int[26];
        for(int i=0;i<s.length();i++){
            a[(int)t.charAt(i)-97]++;
            a[(int)s.charAt(i)-97]--;
        }
        a[(int)t.charAt(t.length()-1)-97]++;
        for(int i=0;i<26;i++){
            if(a[i]!=0)
                return ((char)(i+97));
        }
        return 'a';
    }
}
