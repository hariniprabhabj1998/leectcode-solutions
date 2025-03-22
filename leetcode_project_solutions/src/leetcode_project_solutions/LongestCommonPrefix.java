package leetcode_project_solutions;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strr = new String[] { "flower", "flow", "flight" };
		LongestCommonPrefix l = new LongestCommonPrefix();
		System.out.println(l.longestCommonPrefix(strr));

	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];
		/*
		 * The first word sets an upper limit on how long the prefix can be. Any prefix
		 * longer than the first word would include characters that don’t exist in it,
		 * making it impossible for other words to match.
		 */
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}

		}
		return prefix;
	}

}
