package me.pravc.leetcode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode iter1 = l1;
        ListNode iter2 = l2;

        int carry = 0;
        ListNode head = null, prev = null;
        while (iter1 != null || iter2 != null) {
            int val1 = iter1 != null ? iter1.val : 0;
            int val2 = iter2 != null ? iter2.val : 0;

            int ans = val1 + val2 + carry;
            carry = 0;
            if (ans >= 10) {
                carry = 1;
                ans -= 10;
            }
            ListNode node = new ListNode(ans);
            if (head == null) {
                head = node;
            }

            if (prev != null) {
                prev.next = node;
            }
            prev = node;
            iter1 = (iter1 != null) ? iter1.next : null;
            iter2 = (iter2 != null) ? iter2.next : null;
        }
        if (carry == 1) {
            ListNode node = new ListNode(1);
            prev.next = node;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public String toString() {
            return " " + val + " ->[" + (next != null ? next.val : "null")
                    + "]";
        }
    }

    public static void main(String[] args) {
        ListNode l1 = AddTwoNumbersTest.numberToList(342);
        ListNode l2 = AddTwoNumbersTest.numberToList(465);

        ListNode output = AddTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(AddTwoNumbersTest.getListAsString(output));

        // ListNode expected = AddTwoNumbersTest.numberToList(807);
    }
}
