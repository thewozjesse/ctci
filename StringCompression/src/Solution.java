
public class Solution {
	public String compressString(String s) {
		if (s.length() <= 1)
			return s;
		char ch = s.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < s.length(); ++i) {
			if (s.charAt(i) == ch) {
				++count;
			} else {
				sb.append(ch);
				sb.append(count);
				ch = s.charAt(i);
				count = 1;
			}
		}
		
		sb.append(ch);
		sb.append(count);
		
		if (sb.toString().length() >= s.length())
			return s;
		else
		return sb.toString();
	}
}
