public class Divide_a_String_Into_Groups_of_Size_k {
    public String[] divideString(String s, int k, char fill) {
        int m=s.length();
        int n=m/k;
        if(m%k!=0)
            n++;
        int i=0;
        String a[]=new String[n];
        for(int j=0;j<n-1;j++){
            a[j]="";
            for(int x=0;x<k;x++){
                a[j]+=s.charAt(i);
                i++;
            }
        }
        a[n-1]="";
        while(i<m){
            a[n-1]+=s.charAt(i);
            i++;
        }
        while(a[n-1].length()<k){
            a[n-1]+=fill;
        }
        return a;
    }
}
