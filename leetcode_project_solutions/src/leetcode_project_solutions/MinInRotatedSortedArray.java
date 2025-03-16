package leetcode_project_solutions;

public class MinInRotatedSortedArray {

	public static void main(String[] args) {
		int[] num = new int[] {3,4,1,2};
		MinInRotatedSortedArray min = new MinInRotatedSortedArray();
		System.out.println(min.findMin(num));

	}
	
    public int findMin(int[] nums) {
        int left =0;
        int right = nums.length-1;
        int min = nums[0];
        while(left<=right){ //equals to 
            if(nums[left]<nums[right]){
                min = Math.min(min,nums[left]);
            }
            int mid = (left+right)/2;
            min = Math.min(min,nums[mid]);
            if(nums[left]<=nums[mid]){  //equals to
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return min;
    } //[11,13,15,17]
      //[4,5,6,7,0,1,2]
      //[7,0,1,2,3,4,5,6]

}
