package src;

public class AddTwoNumbers {
	/*
	  You are given two non-empty linked lists representing 
	  two non-negative integers. The digits are stored in 
	  reverse order and each of their nodes contain a single 
	  digit. Add the two numbers and return it as a linked list.

	  You may assume the two numbers do not contain any leading
	  zero, except the number 0 itself.
	 
	  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	  Output: 7 -> 0 -> 8
	  
	  Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	*/
	public static void main(String[] args) {
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);
		
		printListNode(addTwoNumbers(list1, list2));
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode result = prev;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
        	ListNode cur = new ListNode(0);
        	int sum = (l2 == null ? 0 : l2.val) + (l1 == null ? 0 : l1.val) + carry;
        	cur.val = sum % 10;
        	carry = sum / 10;
        	prev.next = cur;
        	prev = cur;
        	
        	l1 = (l1 == null) ? l1 : l1.next;
        	l2 = (l2 == null) ? l2 : l2.next;
        }
        return result.next;
    }
	
	private static void printListNode(ListNode list) {
		ListNode temp = list;
		while(temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
		}
		System.out.println();
	}
}
