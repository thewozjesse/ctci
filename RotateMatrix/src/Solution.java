
public class Solution {
	public void rotateMatrix(int[][] m) {
		for (int i = 0; i < m.length / 2; ++i) {
			int[] temp = m[i];
			m[i] = m[m.length - i - 1];
			m[m.length - i - 1] = temp;
		}
		
		
		for (int i = 0; i < m.length; ++i) {
			for (int j = i + 1; j < m[i].length; ++j) {
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;
			}
		}
	}
}
