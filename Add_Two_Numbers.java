class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}    
public class Add_Two_Numbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode((l1.val+l2.val)%10);
        int car = (l1.val+l2.val)/10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode cur = head;
        while(l1!=null&&l2!=null){
            ListNode temp = new ListNode((l1.val+l2.val+car)%10);
            car = (l1.val+l2.val+car)/10;
            l1 = l1.next;
            l2 = l2.next;
            cur.next = temp;
            cur = cur.next;
        }
        while(l1!=null){
            ListNode temp = new ListNode((l1.val+car)%10);
            car = (l1.val+car)/10;
            l1 = l1.next;
            cur.next = temp;
            cur = cur.next;
        }
        while(l2!=null){
            ListNode temp = new ListNode((l2.val+car)%10);
            car = (l2.val+car)/10;
            l2 = l2.next;
            cur.next = temp;
            cur = cur.next;
        }
        if(car!=0){
            ListNode temp = new ListNode(car);
            cur.next = temp;
        }
        return head;
    }
}