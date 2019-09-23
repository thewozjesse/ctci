
public class Solution {
	public boolean isOneAway(String a, String b) {
		if (Math.abs(a.length() - b.length()) > 1)
			return false;
		
		if (b.length() > a.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		
		int l, r;
		l = r = 0;
		boolean usedSkip = false;
		
		if (a.length() == b.length()) {
			while (l < a.length()) {
				if (a.charAt(l) != b.charAt(l)) {
					if (!usedSkip)
						usedSkip = true;
					else
						return false;
				}
				++l;
			}
		} else {
			while (r < b.length()) {
				if (a.charAt(l) != b.charAt(r) && !usedSkip) {
					if (a.charAt(++l) != b.charAt(r))
						return false;
					else
						usedSkip = true;
				}
				++l;
				++r;
			}
		}
		
		return true;
	}
}
