package leetcode_project_solutions;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "vdfbfgfdfd";
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(l.lengthOfLongestSubstring(s));

	}

	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> hs = new HashSet<>();
		int left = 0;
		int right = 0;
		int ans = 0;

		if (s == null || s.isEmpty()) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}

		for (right = 0; right < s.length(); right++) {
			while (hs.contains(s.charAt(right))) { // if value exist increment left and remove the character until it
													// exist in hashset
				hs.remove(s.charAt(left));
				left++;
			}
			hs.add(s.charAt(right));
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}

}
