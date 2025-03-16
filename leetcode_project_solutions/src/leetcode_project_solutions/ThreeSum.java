package leetcode_project_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] num = new int[] {-1,0,1,2,-1,-4};
		ThreeSum sum = new ThreeSum();
		System.out.println(sum.threeSum(num));

	}

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();

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
				}
			}

		}
	}
}
