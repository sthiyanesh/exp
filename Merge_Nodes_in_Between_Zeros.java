public class Merge_Nodes_in_Between_Zeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(-1);
        ListNode ls = res; 
        int sum = 0;
        while(head != null) {
           if(head.val == 0){
               sum = 0;
               head = head.next;
            }else{
                while(head != null && head.val != 0){
                    sum += head.val;
                    head = head.next;
                }
                    ls.next = new ListNode(sum);
                    ls = ls.next;
            }
         }
        return res.next;
    }
}
