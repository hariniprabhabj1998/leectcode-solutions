package leetcode_project_solutions;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaras";
		ValidAnagram v = new ValidAnagram();
		System.out.println(v.isAnagram(s, t));

	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;

	}
	/*
	 * 'a' has an ASCII value of 97. 'b' has an ASCII value of 98. 'c' has an ASCII
	 * value of 99. ... 'z' has an ASCII value of 122. Example Calculation If we
	 * take s.charAt(i) = 'c':
	 * 
	 * java Copy Edit char ch = 'c'; int index = ch - 'a'; // 'c' - 'a' = 99 - 97 =
	 * 2 This means:
	 * 
	 * 'a' - 'a' = 0 → stored at count[0] 'b' - 'a' = 1 → stored at count[1] 'c' -
	 * 'a' = 2 → stored at count[2] 'z' - 'a' = 25 → stored at count[25]
	 */

}
