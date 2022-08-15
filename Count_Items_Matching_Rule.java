import java.util.*;
public class Count_Items_Matching_Rule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i=0;
        if(ruleKey.equals("color"))
            i=1;
        if(ruleKey.equals("name"))
            i=2;
        int cnt=0;
        for(int j=0;j<items.size();j++){
            if(items.get(j).get(i).equals(ruleValue))
                cnt++;
        }
        return cnt;
    }
}
