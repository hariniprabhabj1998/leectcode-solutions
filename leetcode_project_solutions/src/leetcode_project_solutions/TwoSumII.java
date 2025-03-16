package leetcode_project_solutions;

public class TwoSumII {

	public static void main(String[] args) {
		int[] num = new int[] {2,7,9,11};
		int target = 9;
		TwoSumII sum = new TwoSumII();
		System.out.println(sum.twoSum(num, target));

	}

	public int[] twoSum(int[] numbers, int target) {

		int left = 0;
		int right = numbers.length - 1;
		while (left < right) { //for(int i=0;i<numbers.length;i++) can also be used
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if (sum > target) {
				right = right - 1;
			} else {  //sum<target
				left = left + 1;
			}

		}
		return null;
	}

}
