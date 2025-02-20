package leetcode_project_solutions;


import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum twoSumProblem = new TwoSum();
		int[] arr = new int[]{3,2,4,1};
		int target = 6;
		System.out.println(Arrays.toString(twoSumProblem.twoSum(arr, target)));
//if you don't use Arrays.toString it prints the hashcode(hexa decimal representation of memory address) 
		//of the array  unless you explicitly convert to a readable format
		//System.out.println - does not directly print array elements

	}

}
