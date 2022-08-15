import java.util.*;
public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Integer> l = new ArrayList<>(m.keySet());
        Collections.sort(l, (a,b) -> (m.get(b)-m.get(a)));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = l.get(i);
        }
        return res;
    }
}
