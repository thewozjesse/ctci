import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestZeroMatrix {

	@Test
	void test() {
		Solution sol = new Solution();
		int[][] matrix = {
				{1, 2, 3, 0},
				{1, 2, 3, 5},
				{1, 2, 3, 5},
				{1, 2, 3, 5}
		};
		int[][] test = {
				{0,0,0,0},
				{1, 2, 3, 0},
				{1, 2, 3, 0},
				{1, 2, 3, 0}
		};
		sol.zeroMatrix(matrix);
		assert(Arrays.deepEquals(matrix, test));
	}

	@Test
	void testAgain() {
		Solution sol = new Solution();
		int[][] matrix = {
				{1, 2, 3, 0, 6},
				{1, 2, 3, 5, 6},
				{1, 2, 3, 5, 6},
				{1, 2, 0, 5, 6},
		};
		int[][] test = {
				{0, 0, 0, 0, 0},
				{1, 2, 0, 0, 6},
				{1, 2, 0, 0, 6},
				{0, 0, 0, 0, 0}
		};
		sol.zeroMatrix(matrix);
		assert(Arrays.deepEquals(matrix, test));
	}
}
