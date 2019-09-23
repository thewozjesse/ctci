import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRemoveKthToLast {

	@Test
	void test3() {
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
		
		Node clean = s.removeKthToLast(root, 3);
		ptr = clean;
		String test = "1 1 1 2 3 3 5 5 ";
		StringBuilder sb = new StringBuilder();
		while (ptr != null) {
			sb.append(ptr.val);
			sb.append(" ");
			ptr = ptr.next;
		}
		
		assert(test.compareTo(sb.toString()) == 0);
	}

	@Test
	void test5() {
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
		
		Node clean = s.removeKthToLast(root, 5);
		ptr = clean;
		String test = "1 1 1 2 3 4 5 5 ";
		StringBuilder sb = new StringBuilder();
		while (ptr != null) {
			sb.append(ptr.val);
			sb.append(" ");
			ptr = ptr.next;
		}
		
		assert(test.compareTo(sb.toString()) == 0);
	}
	
	@Test
	void test8() {
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
		
		Node clean = s.removeKthToLast(root, 8);
		ptr = clean;
		String test = "1 1 2 3 3 4 5 5 ";
		StringBuilder sb = new StringBuilder();
		while (ptr != null) {
			sb.append(ptr.val);
			sb.append(" ");
			ptr = ptr.next;
		}
		
		assert(test.compareTo(sb.toString()) == 0);
	}
	
	@Test
	void test9() {
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
		
		Node clean = s.removeKthToLast(root, 9);
		ptr = clean;
		String test = "1 1 1 2 3 3 4 5 5 ";
		StringBuilder sb = new StringBuilder();
		while (ptr != null) {
			sb.append(ptr.val);
			sb.append(" ");
			ptr = ptr.next;
		}
		
		assert(test.compareTo(sb.toString()) == 0);
	}
}
