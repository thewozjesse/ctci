public class Solution {
	public Node removeDups(Node root) {
		Node dummy = new Node(0);
		dummy.next = root;
		Node prev = dummy;
		Node ptr = root;
		
		while (ptr.next != null) {
			if (ptr.val == ptr.next.val)
				prev.next = ptr.next;
			else
				prev = ptr;
			ptr = ptr.next;
		}
		
		return dummy.next;
	}
}
