package leetcode_project_solutions;

public class maxProdSubArray {

	public static void main(String[] args) {
		int[]num = new int[] {2,3,-2,4};
		maxProdSubArray  maxProd = new maxProdSubArray();
		System.out.println(maxProd.maxProduct(num));

	}
	 public int maxProduct(int[] nums) {
	        if(nums.length==0){
	            return 0;
	        }
	        int min = nums[0];
	        int max = nums[0];
	        int result = max;

	        for(int i=1;i<nums.length;i++){
	            int curr = nums[i];
	            int temp = Math.max(curr, Math.max(curr*min, curr*max));
	            min = Math.min(curr, Math.min(curr*min, curr*max));
	            max = temp;
	            result = Math.max(result,max);
	        }
	        return result;
	    }
}
