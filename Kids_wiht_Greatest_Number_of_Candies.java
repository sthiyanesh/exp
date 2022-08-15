import java.util.*;
public class Kids_wiht_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] ar, int extraCandies) {
        List<Boolean> a = new ArrayList<Boolean>();
        int max=ar[0];
        for(int i=1;i<ar.length;i++){
            if(max<ar[i])
                max=ar[i];
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]+extraCandies>=max)
                a.add(true);
            else
                a.add(false);
        }
        return a;
    }
}
