import java.util.*;
public class Maximum_Twin_Sum_of_Linked_List {
    public int pairSum(ListNode head) {
        if(head==null) return 0;
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        int n =0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int stackLength = n/2;
        temp = head;
        int k=0;
        while(temp!=null){
            if(k>=stackLength){
                stack.push(temp);
            }
            k++;
            temp = temp.next;
        }
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        temp = head;
        k=0;
        while(temp!=null && k<stackLength ){
            int tempSum =0;
            if(!stack.isEmpty()){
                tempSum += stack.pop().val;
            }
            tempSum +=  temp.val;
            maxSum = Math.max(tempSum, maxSum);
            k++;
            temp = temp.next;
        }
        return maxSum;
    }
}
