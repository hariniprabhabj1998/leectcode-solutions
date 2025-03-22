package leetcode_project_solutions;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] num = new int[] { 100, 4, 200, 1, 3, 2 };
		LongestConsecutiveSequence l = new LongestConsecutiveSequence();
		System.out.println(l.longestConsecutive(num));
	}

	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
		int longestSub = 1;

		for (int n : hs) {
			if (hs.contains(n - 1)) {/*
										 * If n - 1 is in the set, it means n is not the start of a sequence (because a
										 * smaller number exists). Since n is not the start, we skip checking it to
										 * avoid redundant work. If n - 1 is not in the set, then n is the smallest
										 * number in a sequence, so we start counting from it.
										 */
				continue;
			} else {
				int currentNum = n;
				int currentSub = 1;
				while (hs.contains(currentNum + 1)) {
					currentNum++;
					currentSub++;
				}
				longestSub = Math.max(longestSub, currentSub);
			}
		}
		return longestSub;
	}
}
