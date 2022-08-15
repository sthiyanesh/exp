import java.util.*;
public class Next_Greater_Node_in_Linked_List {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stk=new Stack<>();
        
        int n=getSizeOfLL(head);
        
        int[] res=new int[n];
        
        ListNode curr=head;
        
        ListNode new_head=reverseOfLL(curr);
        
        int i=n-1;
        
        System.out.println(n);
        
        while(new_head!=null){

            if(stk.isEmpty()){
                res[i]=0;
            }
            
            else if(!stk.isEmpty() && new_head.val<stk.peek()){
                res[i]=stk.peek();
            }
            
            else if(!stk.isEmpty() && new_head.val>=stk.peek()){
			
                while(!stk.isEmpty() && new_head.val>=stk.peek()){
                    stk.pop();
                }
				
                if(stk.isEmpty()){
                    res[i]=0;
                }
				
                else{
                    res[i]=stk.peek();
                }
				
            }
			
            stk.add(new_head.val);
			
            new_head=new_head.next;
			
            i--;
            
        }
        
        return res;
    }
    
    public ListNode reverseOfLL(ListNode head){
        
        ListNode curr1=head;
        ListNode prev=null;
        ListNode temp=null;
        
        if(head==null || head.next==null){
            return head;
        }
        
        while(curr1!=null){
            temp=curr1.next; // backup
            curr1.next=prev; // link
            prev=curr1;      // move the previous pointer
            curr1=temp;      // move the current pointer
        }
        
        return prev;
    }
    
    public int getSizeOfLL(ListNode head){
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            size++;
            temp=temp.next;
            
        }
        
        return size;
    }
}
