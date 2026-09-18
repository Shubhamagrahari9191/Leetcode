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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        if(head==null||head.next==null){
            return ;
        }
        //find Middle
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // reverse
        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next=null;
        while(curr!=null){
            ListNode next=curr.next;
               curr.next=prev;
               prev=curr;
                curr=next;

        }

        //Alternate merge
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            ListNode firstnext=first.next;
            ListNode secondnext=second.next;

            first.next=second;
            second.next=firstnext;

            first=firstnext;
            second=secondnext;

        }

    }
    }
       
