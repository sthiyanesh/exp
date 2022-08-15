import java.util.*;
public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> a = new HashSet<Character>();
        int i=0;
        int size=0;
        for(int j=0;j<s.length();j++){
            while(a.contains(s.charAt(j))){
                a.remove(s.charAt(i));
                i++;
            }
            a.add(s.charAt(j));
            size = Math.max(size, j-i+1);
        }
        return size;
    }
}
