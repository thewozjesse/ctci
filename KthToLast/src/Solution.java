
public class Solution {
	public Node removeKthToLast(Node root, int k) {
		int count = 1;
		Node dummy = new Node(0);
		dummy.next = root;
		Node fwd = root;
		Node del = root;
		Node prev = root;
		
		while (fwd.next != null) {
			fwd = fwd.next;
			++count;
			if (count > k) {
				prev = del;
				del = del.next;
			}
		}
		
		if (count > k)
			prev.next = del.next;
		
		return root;
	}
}
