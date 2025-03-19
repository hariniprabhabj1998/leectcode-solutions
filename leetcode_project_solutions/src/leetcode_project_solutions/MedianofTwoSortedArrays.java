package leetcode_project_solutions;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		int[] num1 = new int[] { 1, 3 };
		int[] num2 = new int[] { 2 };
		MedianofTwoSortedArrays median = new MedianofTwoSortedArrays();
		System.out.println(median.findMedianSortedArrays(num1, num2));

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {// making sure x has small array length else calling the method again
											// making sure first array is smaller
			return findMedianSortedArrays(nums2, nums1);
		}

		int x = nums1.length;
		int y = nums2.length;

		int start = 0;
		int end = x;

		while (start <= end) { // total: X+y
								// left partition: (X+Y+1)/2
								// X partition: (S+E)/2
								// y partition:
			int partX = (start + end) / 2;
			int partY = (x + y + 1) / 2 - partX;

			int xLeft = partX == 0 ? Integer.MIN_VALUE : nums1[partX - 1]; // Last element on the left of nums1
			int xRight = partX == x ? Integer.MAX_VALUE : nums1[partX]; // First element on the right of nums1
			int yLeft = partY == 0 ? Integer.MIN_VALUE : nums2[partY - 1]; // Last element on the left of nums2
			int yRight = partY == y ? Integer.MAX_VALUE : nums2[partY]; // First element on the right of nums2

			if (xLeft <= yRight && yLeft <= xRight) {
				if ((x + y) % 2 == 0) {
					return ((double) Math.max(xLeft, yLeft) + Math.min(xRight, yRight)) / 2;
				} else {
					return Math.max(xLeft, yLeft);/*
													 * If total elements are even → median is the average of max(left
													 * partition) and min(right partition). If total elements are odd →
													 * median is max(left partition).
													 */
				}
			} else if (xLeft > yRight) {
				end = partX - 1;
			} else {
				start = partX + 1;
			}
		}

		return 0;
	}

}
