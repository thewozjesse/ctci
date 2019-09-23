import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRemoveDups {

	@Test
	void test() {
		Solution s = new Solution();
		Node root = new Node(1);
		Node ptr = root;
		ptr.next = new Node(1);
		ptr = ptr.next;
		ptr.next = new Node(1);
		ptr = ptr.next;
		ptr.next = new Node(2);
		ptr = ptr.next;
		ptr.next = new Node(3);
		ptr = ptr.next;
		ptr.next = new Node(3);
		ptr = ptr.next;
		ptr.next = new Node(4);
		ptr = ptr.next;
		ptr.next = new Node(5);
		ptr = ptr.next;
		ptr.next = new Node(5);
		ptr = ptr.next;
		
		Node clean = s.removeDups(root);
		ptr = clean;
		String test = "1 2 3 4 5 ";
		StringBuilder sb = new StringBuilder();
		while (ptr != null) {
			sb.append(ptr.val);
			sb.append(" ");
			ptr = ptr.next;
		}
		
		assert(test.compareTo(sb.toString()) == 0);
	}

}
