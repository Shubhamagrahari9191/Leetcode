/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        public ListNode reverse( ListNode head){
        ListNode curr=head;
        ListNode forward=null;
        ListNode prev=null;
        while(curr!=null ){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
        }
     public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode curr=head;
        int max=curr.val;
        while(curr!=null && curr.next!=null){
            if(max>curr.next.val){
                curr.next=curr.next.next;
            }

            else{
                curr=curr.next;
                max=curr.val;
            }

        }

      return reverse(head);  
     }         
}