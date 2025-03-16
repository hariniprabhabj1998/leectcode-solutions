package leetcode_project_solutions;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] num = new int[] {3,4,5,6,0,1,2};
		int target = 0;
		SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
		System.out.println(s.search(num, target));

	}
	
	
	
	    public int search(int[] nums, int target) {
	        int left =0;
	        int right = nums.length-1;
	        while(left<=right){
	            int mid = (left + right)/2;
	            if(nums[mid]==target){
	                return mid;
	            }
	            if(nums[left]<=nums[mid]){
	                 if(target<nums[left] || target>nums[mid]){ //if target is outside left and mid
	                left = mid+1;
	                }
	                else{
	                right = mid-1;
	                }
	            }
	            else{
	                if(target<nums[mid] || target>nums[right]){
	                    right = mid-1;
	                }
	                else{
	                    left = mid+1;
	                }
	            }
	        }
	             return -1;
	    }
	    
	}


