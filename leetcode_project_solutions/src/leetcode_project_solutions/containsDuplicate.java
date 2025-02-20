package leetcode_project_solutions;

import java.util.HashSet;

public class containsDuplicate {

	public static void main(String[] args) {

		int[] num = new int[] { 1, 3, 4, 3, 5 };
		containsDuplicate d = new containsDuplicate();
		System.out.println(d.containDuplicate(num));

	}

	public boolean containDuplicate(int[] nums) {

//		HashMap<Integer, Integer> hm = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			if (hm.containsKey(nums[i])) {
//				return true;
//			}
//			hm.put(nums[i], i);
//		}
//		return false;

		HashSet<Integer> sett = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (sett.contains(nums[i])) {
				return true;
			}
			sett.add(nums[i]);
		}
		return false;

	}

}
//hash map takes unnecessary space
//use hash set for checking duplicates 