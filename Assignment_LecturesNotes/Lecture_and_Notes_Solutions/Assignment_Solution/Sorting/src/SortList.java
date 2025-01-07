import java.util.Arrays;

public class SortList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        head = sortList(head);
    }

    static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        count = 0;
        while (temp != null) {
            arr[count++] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        count = 0;
        while (temp != null) {
            temp.val = arr[count++];
            temp = temp.next;
        }
        return head;
    }


}
