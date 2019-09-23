
public class Solution {
	public String urlify(char[] s, int n) {
		int read = n - 1;
		int write = s.length - 1;
		
		while (read >= 0) {
			if (s[read] != ' ') {
				s[write--] = s[read--];
			} else {
				--read;
				s[write--] = '0';
				s[write--] = '2';
				s[write--] = '%';
			}
		}
		
		return new String(s);
	}
}
