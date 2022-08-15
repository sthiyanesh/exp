public class Add_Digits {
    public int addDigits(int num) {
        int a=num;
        int sum=0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        return (sum>=10)?addDigits(sum):sum;
    }
}
