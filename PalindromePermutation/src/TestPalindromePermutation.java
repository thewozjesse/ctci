import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPalindromePermutation {

	@Test
	void test() {
		Solution sol = new Solution();
		assert(sol.isPalindromePermutation("Tact Coa"));
		assert(sol.isPalindromePermutation("carrace"));
		assert(sol.isPalindromePermutation("a mcan a plan a canal pancama"));
	}

}
