package leetcode_project_solutions;

import java.util.Arrays;

public class ProdOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4};
		ProdOfArrayExceptSelf prod = new ProdOfArrayExceptSelf();
				System.out.println(Arrays.toString(prod.productExceptSelf(num)));

	}
	
	public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post=1;
        int[] result = new int[nums.length];
        Arrays.fill(result,1);

        for (int i=0; i<nums.length;i++){
            result[i] = pre;
            pre = nums[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post = post* nums[i];
        }
        return result;
    }

}
