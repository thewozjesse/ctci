
public class Solution {
	public boolean isPalindromePermutation(String s) {
		if (s.length() <= 1)
			return true;
		
		s = s.toLowerCase();
		int[] map = new int[26];
		char ch;
		boolean usedOdd = false;
		
		for (int i = 0; i < s.length(); ++i) {
			ch = s.charAt(i);
			if (ch != ' ')
				++map[ch - 'a'];
		}
		
		for (int i = 0; i < map.length; ++i) {
			if (map[i] != 0 && map[i] % 2 != 0) {
				if (map[i] % 2 == 1 && !usedOdd)
					usedOdd = true;
				else
					return false;
			}
		}
		
		return true;
	}
}
