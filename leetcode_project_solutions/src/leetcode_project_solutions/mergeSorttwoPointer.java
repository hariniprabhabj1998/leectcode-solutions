package leetcode_project_solutions;

import java.util.Arrays;

public class mergeSorttwoPointer {

	public static void main(String[] args) {
		int[] n1= {1,2,3,0,0,0};
		int[] n2 = {2,4,6};
		int m=3;
		int n=3;
		mergeSorttwoPointer merg = new mergeSorttwoPointer();
		merg.merge(n1, m, n2, n);
		System.out.println(Arrays.toString(n1));

	}
	
//time complexity: O(m+n)
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        for(int i=nums1.length-1; i>=0;i--){
	            if(m > 0 && (n == 0 || nums1[m-1]>nums2[n-1])){
	                nums1[i] = nums1[m-1];
	                m--;
	            }
	            else{
	                nums1[i] = nums2[n-1];
	            n--;
	            }
	            
	        }
	    }
	

}
