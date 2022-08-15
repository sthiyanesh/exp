public class strStr1 {
    public int strStr(String haystack, String needle) {
        int a=haystack.length();
        int b=needle.length();
        if(b==0)
            return 0;
        if(b>a)
            return -1;
        for(int i=0;i<a-b+1;i++){
            if (haystack.substring(i, i+b).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
