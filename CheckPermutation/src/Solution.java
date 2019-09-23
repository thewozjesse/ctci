
public class Solution {
	public boolean isPermutation(String a, String b) {
		if (a.length() != b.length())
			return false;
		else if (a.length() == 0)
			return true;
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		int[] map1 = new int[26];
		int[] map2 = new int[26];
		char aChar, bChar;
		
		for (int i = 0; i < a.length(); ++i) {
			aChar = a.charAt(i);
			bChar = b.charAt(i);
			++map1[aChar - 'a'];
			++map2[bChar - 'a'];
		}
		
		for (int i = 0; i < 26; ++i) {
			if (map1[i] != map2[i])
				return false;
		}
		
		return true;
	}
}
