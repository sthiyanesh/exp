import java.util.*;
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        for(int i=0;i<=numRows;i++){
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
        return a;
    }
}
