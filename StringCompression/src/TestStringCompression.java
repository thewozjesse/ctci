import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringCompression {

	@Test
	void test() {
		Solution sol = new Solution();
		assert(sol.compressString("aabcccccaaa").equals("a2b1c5a3"));
		assert(sol.compressString("abcdef").equals("abcdef"));
		assert(sol.compressString("aaabbbcccddd").equals("a3b3c3d3"));
		assert(sol.compressString("aabb").equals("aabb"));
	}

}
