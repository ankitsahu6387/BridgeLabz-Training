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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        k = k % length;
        if (k == 0) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = head;
        ListNode prev = dummy;
        while(k>0){
            while(tail.next!=null){
                tail = tail.next;
                prev = prev.next;
            }
            tail.next = head;
            prev.next = null;
            head = tail;
            dummy.next = head;
            prev = dummy;
            k--;         
        }
        return dummy.next;
    }
}