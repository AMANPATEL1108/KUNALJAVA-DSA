public class ReorderList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReorderList solution = new ReorderList();
        solution.reorderList(head);

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode left = head;
        ListNode right = prev;

        while (left != null && right != null) {
            ListNode temp = left.next;
            left.next = right;
            left = temp;

            temp = right.next;
            right.next = left;
            right = temp;
        }
        if (left != null) {
            left.next = null;
        }
    }
}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
