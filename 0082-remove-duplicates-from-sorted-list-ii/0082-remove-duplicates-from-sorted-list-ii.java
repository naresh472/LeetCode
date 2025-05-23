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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        HashMap<Integer,Integer> count  = new HashMap<>();
         while (current != null)
         {
            count.put(current.val,count.getOrDefault(current.val,0)+1);
            current = current.next;
         }
        ListNode dummy  = new ListNode(0);
        ListNode tail = dummy;
        current = head;
        while(current != null)
         {
            if(count.get(current.val) == 1)
            {
               tail.next =new ListNode(current.val);
               tail = tail.next;   
            }
            current = current.next;
         }
    

        return dummy.next;
        
    }
}