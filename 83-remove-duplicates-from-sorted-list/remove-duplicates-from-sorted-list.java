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
        if(head == null){
            return null;
        }
         ListNode cur = head;
         ListNode temp = head.next;

         while(temp != null){
            if(cur.val == temp.val){
                temp = temp.next;
                cur.next = temp;
            }else{
                cur = temp;
                temp = temp.next;
            }
         }
         return head;
    }
}