public class Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public boolean areAlmostEqual(String s1, String s2) {
        int ar[] = new int[2];
        int j=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(j==2)
                    return false;
                else{
                    ar[j]=i;
                    j++;
                }
            }
        }
        if(j==0)
            return true;
        if(j!=2)
            return false;
        if((s1.charAt(ar[0])==s2.charAt(ar[1]))&&(s1.charAt(ar[1])==s2.charAt(ar[0])))
            return true;
        return false;
    }
}
