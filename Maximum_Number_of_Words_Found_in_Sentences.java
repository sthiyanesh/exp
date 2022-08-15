public class Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(int i=0;i<s.length;i++){
            int temp=0;
            for(int j=0;j<s[i].length();j++){
                if(s[i].charAt(j)==' ')
                    temp++;
            }
            if(temp>max)
                max=temp;
        }
        return max+1;
    }
}
