public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String s= strs[0];
        for(int i=0;i<strs.length;i++){
            String temp="";
            int x=0;
            if(strs[i].length()==0)
                return "";
            if(s.length()<strs[i].length())
                x=s.length();
            else
                x=strs[i].length();
            for(int j=0;j<x;j++){
                if(strs[i].charAt(j)==s.charAt(j)){
                    temp +=s.charAt(j);
                }else{
                    break;
                }
            }
            if(temp.length()==0)
                return "";
            s=temp;
        }
        return s;
    }
}
