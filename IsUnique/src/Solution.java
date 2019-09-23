
public class Solution {
	public boolean isUnique(String s) {
		if (s.length() <= 1)
			return true;
		
		int[] map = new int[256];
		
		for (int i = 0; i < s.length(); ++i) {
			char curr = s.charAt(i);
			if (map[curr - 'a'] > 0)
				return false;
			else
				map[curr - 'a'] = 1;
		}
		
		return true;
	}
}
