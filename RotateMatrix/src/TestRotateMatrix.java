import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestRotateMatrix {

	@Test
	void test() {
		Solution sol = new Solution();
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		int[][] test = {
				{13, 9, 5, 1},
				{14, 10, 6, 2},
				{15, 11, 7, 3},
				{16, 12, 8, 4}
		};
		
		sol.rotateMatrix(matrix);
		assert(Arrays.deepEquals(matrix, test));
	}

}
