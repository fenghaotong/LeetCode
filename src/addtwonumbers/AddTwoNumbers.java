package addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        ListNode head2 = new ListNode(4);
        ListNode s1Node1 = new ListNode(2);
        ListNode s1Node2 = new ListNode(4);
        ListNode s1Node3 = new ListNode(3);
        ListNode s2Node1 = new ListNode(5);
        ListNode s2Node2 = new ListNode(6);
        ListNode s2Node3 = new ListNode(4);
        head.next = s1Node1;
        s1Node1.next = s1Node2;
        s1Node2.next = s1Node3;
        head2.next = s2Node1;
        s2Node1.next = s2Node2;
        s2Node2.next = s2Node3;

        ListNode result = addTwoNumbers(head, head2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode head = null, tail = null;
        int use = 0, tmp = 0;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null) {
                tmp = l1.val + l2.val + use;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                tmp = l1.val + use;
                l1 = l1.next;
            } else {
                tmp = l2.val + use;
                l2 = l2.next;
            }
            use = tmp / 10;
            if(head == null) {
                head = tail = new ListNode(tmp % 10);
            } else {
                tail.next = new ListNode(tmp % 10);
                tail = tail.next;
            }
        }
        if(use > 0 && tail != null) {
            tail.next = new ListNode(use);
        }
        return head;
    }
}


