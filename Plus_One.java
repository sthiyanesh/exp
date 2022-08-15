import java.util.*;
public class Plus_One {
    public int[] plusOne(int[] digits) {
        List<Integer> a = new ArrayList<Integer>();
        int flag=1;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]=digits[i]+flag;
            flag=digits[i]/10;
            a.add(digits[i]%10);
        }
        int n= digits.length;
        if(flag!=0){
            a.add(flag);
            n=n+1;
        }
        int[] arr = new int[n];
        int j=0;
        for(int i: a){
            arr[n-1-j]=i;
            j++;
        }
        return arr;
    }
}
