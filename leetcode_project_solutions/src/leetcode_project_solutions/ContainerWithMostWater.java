package leetcode_project_solutions;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] h = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerWithMostWater area = new ContainerWithMostWater();
		System.out.println(area.maxArea(h));

	}

	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;
		while (left < right) {

			int h = Math.min(height[left], height[right]);
			int w = right - left;
			int area = h * w;
			maxArea = Math.max(area, maxArea);

			if (height[left] > height[right]) {
				right = right - 1;
			} else {
				left = left + 1;
			}

		}

		return maxArea;
	}

}
