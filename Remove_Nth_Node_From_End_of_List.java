public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int steep = 1;
        while (fast.next != null) {
            fast = fast.next;
            if (steep > n) {
                slow = slow.next;
            }
            steep++;
        }
        if (steep < n) return null;
        if (steep == n) return slow.next;
        // NthFromEnd : slow.next
        slow.next = slow.next.next;
        return head;
    }
}
