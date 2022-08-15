public class Swapping_Nodes_in_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy, front = dummy;
        
        for (int itr = 0; itr < k; itr++){
            fast = fast.next;
            front = front.next;
        }
        
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        int temp = front.val;
        front.val = slow.val;
        slow.val = temp;
        
        return dummy.next;
    }
}
