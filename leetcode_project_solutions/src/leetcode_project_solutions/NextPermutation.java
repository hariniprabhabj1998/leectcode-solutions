package leetcode_project_solutions;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] num = new int[] {1,3,4,2};
		NextPermutation n = new NextPermutation();
		n.nextPermutation(num);
		System.out.println(Arrays.toString(num));

	}
	
	    public void nextPermutation(int[] nums) {
	        int i = nums.length-2;
	        
	        while(i>=0 && nums[i+1] <= nums[i]){
	            i--;
	        }
	        if(i >= 0){
	            int j = nums.length - 1;
	            while(nums[j] <= nums[i]){
	                j--;
	            }
	            swap(nums,i,j);
	        }
	        reverse(nums, i+1);
	    }

	    public void swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	         nums[j] = temp;
	    }
	    public void reverse(int[] nums ,int i){
	        int j = nums.length-1;
	        while(i<j){
	            swap(nums,j,i);
	            i++;
	            j--;
	        }
	    }
	

}
