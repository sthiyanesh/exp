public class Excel_Sheet_Column_Title {
    public String convertToTitle(int columnNumber) {
        int a=columnNumber;
        String s="";
        while(a>0){
            int rem=a%26;
            if(rem==0){
                s='Z'+s;
                a=a-1;
            }else{
                s=((char)(rem+64))+s;
            }
            a=a/26;
        }
        return s;
    }
}
