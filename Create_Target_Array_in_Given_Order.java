import java.util.*;
public class Create_Target_Array_in_Given_Order {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
          list.add(index[i], nums[i]);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
          ans[i] = list.get(i);
        }
        return ans;
    }
}
