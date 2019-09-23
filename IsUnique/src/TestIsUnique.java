import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIsUnique {

	@Test
	void test() {
		Solution sol = new Solution();
		assert(sol.isUnique("abcdefghijklmnopqrstuv"));
	}
	
	@Test
	void testFalse() {
		Solution sol = new Solution();
		assert(sol.isUnique("aabcd") == false);
		assert(sol.isUnique("abcdefghijklmnoopqrstuv") == false);
	}
	
	@Test
	void testNothing() {
		Solution sol = new Solution();
		assert(sol.isUnique("a"));
		assert(sol.isUnique(""));
	}
}
