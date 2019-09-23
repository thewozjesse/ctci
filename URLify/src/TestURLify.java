import org.junit.jupiter.api.Test;

class TestURLify {

	@Test
	void test() {
		Solution sol = new Solution();
		char[] s = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
		assert(sol.urlify(s, 13).equals("Mr%20John%20Smith"));
	}

}
