public class Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        String res = "";
        String[] a= s.split(" ");
        for(int i=0;i<a.length;i++){
            String temp1="";
            int n=a[i].length();
            for(int j=0;j<n;j++){
                temp1+=a[i].charAt(n-1-j);
            }
            if(i==a.length-1)
                res+=temp1;
            else
                res+=temp1+" ";
        }
        return res;
    }
}
