package assignment;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) 
    { 
    	this.val = val; 
    }
}

public class Solution {
	
	
    public static ListNode concatenate(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        ListNode curr = head1;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head2;
        return head1;
    }
    
    public static void zigzag(ListNode head) {
        if (head == null || head.next == null) return;
        boolean flag = true;
        ListNode curr = head;
        while (curr.next != null) {
            if (flag) {
                if (curr.val > curr.next.val) {
                    int temp = curr.val;
                    curr.val = curr.next.val;
                    curr.next.val = temp;
                }
            } else {
                if (curr.val < curr.next.val) {
                    int temp = curr.val;
                    curr.val = curr.next.val;
                    curr.next.val = temp;
                }
            }
            curr = curr.next;
            flag = !flag;
        }
    }
    
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}