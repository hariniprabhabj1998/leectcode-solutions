package leetcode_project_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] num = new int[] { -1, 0, 1, 2, -1, -4 };
		ThreeSum sum = new ThreeSum();
		System.out.println(sum.threeSum(num));

	}

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();

		/*
		 * nums[i] <= 0 Why nums[i] <= 0? The array is sorted, so negative numbers (or
		 * zero) appear first. The goal is to find three numbers that sum to 0:
		 * nums[i]+nums[left]+nums[right]=0 If nums[i] > 0, then nums[left] and
		 * nums[right] (which are also positive or zero) cannot sum to a negative value.
		 * So, no valid triplet exists if nums[i] > 0, and we can stop early.
		 */

		for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				twoSum2(nums, i, result);
			}
		}
		return result;
	}

	public void twoSum2(int[] nums, int i, List<List<Integer>> result) {
		int left = i + 1;
		int right = nums.length - 1;

		while (left < right) {
			int sum = nums[i] + nums[left] + nums[right];
			if (sum > 0) {
				right = right - 1;
			} else if (sum < 0) {
				left = left + 1;
			} else {
				result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
				while (left < right && nums[left] == nums[left - 1]) {
					++left;

					/*
					 * Why is this needed? Since the array is sorted, duplicate values can appear in
					 * consecutive indices. If we don't skip them, we might end up adding the same
					 * triplet multiple times. This loop increments left as long as the next element
					 * is the same as the previous one. Condition: nums[left] == nums[left - 1] This
					 * ensures that we move left past any duplicate elements.
					 */
				}
			}

		}
	}
}
