package leetcode_project_solutions;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		int n = 2;
		String s = "ABBBAA";
		LongestRepeatingCharacterReplacement l = new LongestRepeatingCharacterReplacement();
		System.out.println(l.characterReplacement(s, n));

	}

	public int characterReplacement(String s, int k) {
		int[] occurence = new int[26];
		int left = 0;
		int right = 0;
		int maxoccurence = 0;
		int ans = 0;

		for (right = 0; right < s.length(); right++) {
			maxoccurence = Math.max(maxoccurence, ++occurence[s.charAt(right) - 'A']);
			if (right - left + 1 - maxoccurence > k) {
				occurence[s.charAt(left) - 'A']--;
				left++;
			}
			ans = Math.max(ans, right - left + 1);
		}
		return ans;

	}

}
