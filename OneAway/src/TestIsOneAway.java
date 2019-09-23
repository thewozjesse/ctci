import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIsOneAway {

	@Test
	void test() {
		Solution sol = new Solution();
		assert(sol.isOneAway("pl", "") == false);
		assert(sol.isOneAway("p", "") == true);
		assert(sol.isOneAway("", "p") == true);
		assert(sol.isOneAway("brakes", "pakes") == false);
		assert(sol.isOneAway("plan", "blan"));
		assert(sol.isOneAway("pale", "ple"));
		assert(sol.isOneAway("pales", "pale"));
		assert(sol.isOneAway("pale", "bale"));
		assert(sol.isOneAway("pale", "bake") == false);
	}

}
