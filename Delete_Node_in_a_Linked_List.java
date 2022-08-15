public class Delete_Node_in_a_Linked_List {
    public void deleteNode(ListNode node) {
        while(node!=null){
            ListNode temp = node.next;
            node.val=temp.val;
            if(temp.next==null)
                node.next=null;
            node = node.next;
        }
    }
}
