import java.util.*;
public class OrderedStream {
    List<String> a;
    int i;
    public OrderedStream(int n) {
        a = new ArrayList<String>();
        for(int j=0;j<n;j++){
            a.add(null);
        }
        i=0;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> b = new ArrayList<String>();
        a.set(idKey-1,value);
        while(i<a.size()&&a.get(i)!=null){
            b.add(a.get(i));
            i++;
        }
        return b;
    }
}
