import java.util.*;
public class Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        for(int i=0;i<=rowIndex+1;i++){
            List<Integer> temp = new ArrayList<Integer>();
            if(i==0){
                temp.add(1);
                a.add(temp);
            }else{
                for(int j=0;j<i;j++){
                    if(j==0||j==i-1)
                        temp.add(1);
                    else
                        temp.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
                }
                a.add(temp);
            }
        }
        a.remove(0);
        return a.get(rowIndex);
    }
}
