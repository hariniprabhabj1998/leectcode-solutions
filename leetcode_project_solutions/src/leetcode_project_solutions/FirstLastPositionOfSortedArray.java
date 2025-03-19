package leetcode_project_solutions;

import java.util.Arrays;

public class FirstLastPositionOfSortedArray {

	public static void main(String[] args) {
		int[] num = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		FirstLastPositionOfSortedArray a = new FirstLastPositionOfSortedArray();
		System.out.println(Arrays.toString(a.searchRange(num, target)));

	}

//	}
	public int[] searchRange(int[] nums, int target) {

//				for (int i = 0; i < nums.length - 1; i++) {
//				if (nums[i] == nums[i + 1] && nums[i] == target) {// checking the two consecutive values are same and if yes
//																	// are they same equal to target
//					return new int[] { i, i + 1 };
		//
//				}
//			}
//			return new int[] { -1, -1 };
		int first = findBound(nums, target, true);
		int last = findBound(nums, target, false);
		return new int[] { first, last };
	}

	private int findBound(int[] nums, int target, boolean isFirst) {
		int left = 0, right = nums.length - 1;
		int bound = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				bound = mid; // Store the index
				if (isFirst) {
					right = mid - 1; // Move left to find first occurrence
				} else {
					left = mid + 1; // Move right to find last occurrence
				}
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return bound;
	}
}

/*
 * Approach:

Use Binary Search Twice – First to find the first occurrence of target, then to find the last occurrence.
Finding First Occurrence –
Use binary search: If nums[mid] == target, store mid and search left (right = mid - 1).
If nums[mid] < target, move right (left = mid + 1), else move left.
Finding Last Occurrence –
If nums[mid] == target, store mid and search right (left = mid + 1).
If nums[mid] > target, move left (right = mid - 1), else move right.
Return [first, last] indices. If not found, return [-1, -1].
Time Complexity: O(log n), as we perform two binary searches.
*/