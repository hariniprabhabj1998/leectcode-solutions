package leetcode_project_solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKElements {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		TopKElements kEle = new TopKElements();
		System.out.println(Arrays.toString(kEle.topKFrequent(num, k)));

	}

	public int[] topKFrequent(int[] nums, int k) {

		if (k == nums.length) {
			return nums;
		}

		Map<Integer, Integer> count = new HashMap<>();
		for (int n : nums) { // for(int i=0; i<nums.length;i++){
								// int n = nums[i];
			count.put(n, count.getOrDefault(n, 0) + 1); // getOrDefault(Object key, V defaultValue)
		}

		Queue<Integer> heap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));
		/*
		 * This lambda expression is used to sort elements in ascending order of their
		 * frequency:
		 * 
		 * If count.get(a) < count.get(b) → a comes before b. If count.get(a) >
		 * count.get(b) → b comes before a. If count.get(a) == count.get(b) → Their
		 * relative order is unchanged.
		 */
		for (int n : count.keySet()) {
			heap.add(n);
			if (heap.size() > k) {
				heap.poll(); // poll() removes and returns the smallest element first.
			}
		}

		int[] ans = new int[k];
		for (int i = 0; i < k; i++) {
			ans[i] = heap.poll();
		}

		return ans;

	}

}
