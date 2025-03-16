package leetcode_project_solutions;

public class MaxSubarray {

	public static void main(String[] args) {
		int[] num = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		MaxSubarray max = new MaxSubarray();
		System.out.println(max.maxSubArray(num));
		

	}
	 public int maxSubArray(int[] nums) {
	        int currSum = 0;
	        int maxSum = nums[0];
	        for (int i=0;i<nums.length;i++){
	           
	            currSum = currSum + nums[i];
	            maxSum = Math.max(currSum, maxSum);

	            if(currSum<0){
	                currSum =0;
	            }
	        }
	        return maxSum;
	    }

}


/* Brute force
public class MaximumSubarrayBruteForce {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j]; // Compute sum of subarray nums[i:j]
                maxSum = Math.max(maxSum, sum); // Update max sum
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}



*/