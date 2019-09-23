
public class Solution {
	public void removeMiddleNode(Node n) throws Exception {
		if (n == null || n.next == null)
			throw new Exception("Has to be a middle node");
		
		n.val = n.next.val;
		n.next = n.next.next;
	}
}
