package leetcode_project_solutions;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] num = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		RemoveDuplicates d = new RemoveDuplicates();
		System.out.println(d.removeDuplicates(num));
		System.out.println(Arrays.toString(num));

	}

	public int removeDuplicates(int[] nums) {

		int insertIndex = 1;
		for (int i = 1; i < nums.length; i++) {// we use from i=1 since i=0 is distinct
			if (nums[i] != nums[i - 1]) { // checking for duplicates values..
				                         // if unique found adding in insertIndex
				nums[insertIndex] = nums[i];
				insertIndex++;
			}
		}
		return insertIndex;
	}

}
