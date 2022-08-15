public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                s1+=Character.toLowerCase(s.charAt(i));
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
