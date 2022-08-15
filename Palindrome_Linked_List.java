public class Palindrome_Linked_List {
    ListNode front;
    public boolean isPalindrome(ListNode cur)  {
        front = cur;
        if (cur == null) 
            return true;
        return recurse(cur);
    }
    boolean recurse(ListNode back) {
        if (back == null) 
            return true;
        boolean res = recurse(back.next) && front.val == back.val; 
        front = front.next;
        return res;
    }
}
