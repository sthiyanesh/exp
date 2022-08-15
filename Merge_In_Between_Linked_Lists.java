public class Merge_In_Between_Linked_Lists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head=list1;
        ListNode temp1=list1,temp2=list1;
        while(a>1){
            temp1=temp1.next;
            temp2=temp2.next;
            a--;
            b--;
        }
        while(b>=0){
            temp2=temp2.next;
            b--;
        }
        temp1.next=list2;
        ListNode temp3=list2;
        while(temp3.next!=null)
            temp3=temp3.next;
        temp3.next=temp2;
        return head;
    }
}
