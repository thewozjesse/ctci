import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringRotation {

	@Test
	void test() {
		Solution sol = new Solution();
		assert(sol.isStringRotation("waterbottle", "erbottlewat"));
		assert(sol.isStringRotation("waterbottle", "erbotteewat") == false);
	}

}
