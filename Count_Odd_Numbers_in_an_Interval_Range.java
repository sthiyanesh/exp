public class Count_Odd_Numbers_in_an_Interval_Range {
    public int countOdds(int low, int high) {
        if(low==high){
            if(low%2==0){
                return 0;
            }else{
                return 1;
            }
        }
        if(low%2==0){
            low++;
        }
        if(high%2==0){
            high--;
        }
        if(low==high){
            if(low%2==0){
                return 0;
            }else{
                return 1;
            }
        }
        return (high-low)/2+1;
    }
}
