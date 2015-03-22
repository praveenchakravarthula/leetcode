package me.pravc.leetcode;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNull;
import me.pravc.leetcode.AddTwoNumbers.ListNode;

import org.testng.annotations.Test;

public class AddTwoNumbersTest {

    @Test
    public void numberToListTest() {
        System.out.println(getListAsString(numberToList(400)));
        System.out.println(getListAsString(numberToList(2)));
        System.out.println(getListAsString(numberToList(807)));
    }

    @Test
    public void exampleTest() {
        ListNode l1 = numberToList(342);
        ListNode l2 = numberToList(465);

        ListNode expected = numberToList(807);
        ListNode outputList = AddTwoNumbers.addTwoNumbers(l1, l2);
        compareLists(outputList, expected);
    }

    @Test
    public void carryOverTest() {
        ListNode l1 = numberToList(9);
        ListNode l2 = numberToList(3);

        ListNode expected = numberToList(12);
        ListNode outputList = AddTwoNumbers.addTwoNumbers(l1, l2);
        compareLists(outputList, expected);
    }

    @Test
    public void differenLengthNumbersTest() {
        ListNode l1 = numberToList(9);
        ListNode l2 = numberToList(399);

        ListNode expected = numberToList(408);
        ListNode outputList = AddTwoNumbers.addTwoNumbers(l1, l2);
        compareLists(outputList, expected);
    }

    static ListNode numberToList(int number) {
        ListNode head = null, prev = null;
        do {
            int digit = number % 10;
            ListNode node = new ListNode(digit);
            if (head == null) {
                head = node;
            }

            if (prev != null) {
                prev.next = node;
            }

            prev = node;
            number = (int) (number / 10);

        } while (number > 0);
        return head;
    }

    static void compareLists(ListNode l1, ListNode l2) {
        ListNode iter1 = l1;
        ListNode iter2 = l2;

        while (iter1 != null) {
            // l2 doesn't have less number of digits
            assertNotNull(iter2);
            assertEquals(iter1.val, iter2.val);
            iter1 = iter1.next;
            iter2 = iter2.next;
        }

        // l2 doesn't have more number of digits
        assertNull(iter2);
    }

    static String getListAsString(ListNode head) {
        StringBuilder sb = new StringBuilder();

        ListNode iter = head;
        while (iter != null) {
            sb.append(String.format(" %d ", iter.val));
            if (iter.next != null) {
                sb.append("->");
            }

            iter = iter.next;
        }

        return sb.toString();
    }
}
