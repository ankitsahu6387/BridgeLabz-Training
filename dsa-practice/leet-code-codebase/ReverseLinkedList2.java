class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode leftend = head;
        ListNode rightend = head;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
            leftend = leftend.next;
        }
        for (int i = 1; i < right; i++) {
            rightend = rightend.next;
        }
        ListNode tempHead = leftend;
        ListNode tempPrev = null;
        ListNode curr = leftend;
        ListNode stop
         = rightend.next;
        while(curr != stop) {
            ListNode nextNode = curr.next;
            curr.next = tempPrev;
            tempPrev = curr;
            curr = nextNode;
        }
        prev.next = tempPrev;
        tempHead.next = stop;
        return dummy.next;
    }
}
