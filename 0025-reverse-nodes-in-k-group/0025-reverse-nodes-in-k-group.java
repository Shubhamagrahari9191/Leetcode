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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<ListNode> list = new ArrayList<>();
        if(head==null||k==1)
        return head;
        ListNode tem = head;
        while (tem != null) {
            list.add(tem);
            tem = tem.next;
        }
        int start=0;
        
      while (start+k-1 < list.size()) {
         int i = start;
         int j = start+k - 1;

        while (i < j) {
            ListNode temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        start+=k;
        }
        for (int x = 0; x < list.size() - 1; x++) {
            list.get(x).next = list.get(x + 1);
        }

        list.get(list.size() - 1).next = null;
        return list.get(0);
    }
}