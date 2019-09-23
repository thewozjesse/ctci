
public class Solution {
	public boolean isStringRotation(String a, String b) {
		if (a.length() != b.length())
			return false;
		
		for (int i = 0; i < a.length(); ++i) {
			if (matches(a, b, i))
				return true;
		}
		
		return false;
	}
	
	public boolean matches(String a, String b, int index) {
		int length = b.length();
		for (int i = 0; i < length; ++i) {
			int pos = (i + index) % length;
			if (a.charAt(i) != b.charAt(pos))
				return false;
		}
		return true;
	}
}
