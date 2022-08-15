public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int a = 0;
        int b=x;
        while(x>0){
            a=a*10+x%10;
            x/=10;
        }
        if(a==b)
            return true;
        return false;
    }
}
