public class Merger_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode list=null;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                if(list == null){
                    list = list1;
                    head = list;
                    
                }else{
                    list.next=list1;
                    list = list.next;
                }
                list1 = list1.next;
            }else{
                if(list == null){
                    list = list2;
                    head=list;
                }else{
                    list.next=list2;
                    list = list.next;
                }
                list2 = list2.next;
            }
        }
        while(list1!=null){
            if(list==null){
                list=list1;
                head=list;
            }else{
                list.next=list1;
                list = list.next;
            }
            list1 = list1.next;
        }
        while(list2!=null){
            if(list==null){
                list=list2;
                head=list;
            }else{
                list.next=list2;
                list = list.next;
            }
            list2 = list2.next;
        }
        return head;
    }

}
