package leetcode_project_solutions;


import java.util.HashMap;
import java.util.Arrays;


public class TwoSum {
	public static void main(String[] args) {
		TwoSum twoSumProblem = new TwoSum();
		int[] arr = new int[] { 3, 2, 4, 1 };
		int target = 6;
		System.out.println(Arrays.toString(twoSumProblem.twoSum(arr, target)));

//if you don't use Arrays.toString it prints the hashcode(hexa decimal representation of memory address) 
//of the array  unless you explicitly convert to a readable format
//System.out.println - does not directly print array elements

	}

	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length;i++){
          int diff = target - nums[i];
          if(hm.containsKey(diff)){
               return new int[]{hm.get(diff), i};
          }
           hm.put(nums[i],i);
        }
        return null;
   }
}
//Ctrl+shift+F - to format the code