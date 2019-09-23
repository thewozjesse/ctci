import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckPermutationTest {

	@Test
	void testBasics() {
		Solution sol = new Solution();
		assert(sol.isPermutation("", ""));
		assert(sol.isPermutation("a", "a"));
		assert(sol.isPermutation("a", "ab") == false);
	}

	@Test
	void testExamples() {
		Solution sol = new Solution();
		assert(sol.isPermutation("aabaacd", "cdabaaa"));
		assert(sol.isPermutation("aaVbaacd", "cdabaaa") == false);
		assert(sol.isPermutation("fatcatyo", "taftacoy"));
		assert(sol.isPermutation("fatcatyo", "tafetacoy") == false);
		assert(sol.isPermutation("TACOCAT", "catotac"));
		assert(sol.isPermutation("TADOCAT", "catotac") == false);
	}
}
