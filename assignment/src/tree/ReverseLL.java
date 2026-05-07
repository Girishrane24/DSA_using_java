package tree;


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        // Find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse second half
        ListNode second = reverse(slow.next);
        
        // Compare halves
        ListNode first = head;
        while (second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class ReverseLL {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println("Test 1: " + new Solution().isPalindrome(head1));  // true
        
        // Test case 2: Not palindrome [1,2]
        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println("Test 2: " + new Solution().isPalindrome(head2));  // false
        
        // Test case 3: Single node
        ListNode head3 = new ListNode(1);
        System.out.println("Test 3: " + new Solution().isPalindrome(head3));  // true
	}
}
