public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        int llen=0;
        int flag=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' ')
                flag=1;
            else{
                if(flag==0)
                    llen++;
                else{
                    flag=0;
                    llen=1;
                }
            }
                
        }
        return llen;
    }
}
