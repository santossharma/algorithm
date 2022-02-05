package leetcode.medium;

/* 19. Remove Nth Node From End of List
 https://leetcode.com/problems/remove-nth-node-from-end-of-list/

 Given the head of a linked list, remove the nth node from the end of the list and return its head.

    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]

    Input: head = [1], n = 1
    Output: []

*/

import apnacollege.CustomLinkedList;

public class RemoveNthFromEndLeetCode19 {

    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void add(int data) {
        if(head == null) {
            head = new ListNode(data, null);
            return;
        }

        ListNode currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        ListNode newNode = new ListNode(data, null);
        currentNode.next = newNode;
    }

    // actual method for leetcode solution
    public ListNode removeNthFromLast(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fastNode = dummy;
        ListNode slowNode = dummy;

        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }

        while(fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        System.out.println("slowNode [val] "+slowNode.val+ " fastNode [val] "+fastNode.val);
        slowNode.next = slowNode.next.next; // slowNode needs to point the node after the fastNode

        // Since DummyNode is still at '0', so need to move it 1 step forward using .next
        return dummy.next;
    }

    public void printLinkedList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode currentNode = head; // always take head's copy and traverse through the copy
        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        RemoveNthFromEndLeetCode19 removeNthFromEndLeetCode19 = new RemoveNthFromEndLeetCode19();
        removeNthFromEndLeetCode19.add(1);
        removeNthFromEndLeetCode19.add(2);
        removeNthFromEndLeetCode19.add(3);
        removeNthFromEndLeetCode19.add(4);
        removeNthFromEndLeetCode19.add(5);

        removeNthFromEndLeetCode19.removeNthFromLast(removeNthFromEndLeetCode19.head, 2);

        removeNthFromEndLeetCode19.printLinkedList();
    }

}
