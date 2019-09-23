import java.util.LinkedList;
import java.util.Queue;

import javafx.util.Pair;

public class Solution {
	public void zeroMatrix(int[][] m) {
		int rows = m.length;
		int cols = m[0].length;
		Queue<Pair<Integer, Integer>> q = new LinkedList<>();
		
		for (int row = 0; row < rows; ++row) {
			for (int col = 0; col < cols; ++col) {
				if (m[row][col] == 0) {
					q.add(new Pair<Integer, Integer>(row, col));
				}
			}
		}
		
		while (!q.isEmpty()) {
			Pair<Integer, Integer> p = q.poll();
			int row = p.getKey();
			int col = p.getValue();
			
			for (int i = 0; i < cols; ++i)
				m[row][i] = 0;
			for (int i = 0; i < rows; ++i)
				m[i][col] = 0;
		}
	}
}
