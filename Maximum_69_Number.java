public class Maximum_69_Number {
    public int maximum69Number (int num) {
        int a=0,b=0;
        while(num>0){
            a=a*10+num%10;
            num/=10;
        }
        int flag=0;
        while(a>0){
            int c=a%10;
            if(flag==0&&c==6){
                flag=1;
                b=b*10+9;
            }else{
                b=b*10+c;
            }
            a/=10;
        }
        return b;
    }
}
