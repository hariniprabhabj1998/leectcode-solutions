package leetcode_project_solutions;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] num = new int[] {100,4,200,1,3,2};
		LongestConsecutiveSequence l = new LongestConsecutiveSequence();
		System.out.println(l.longestConsecutive(num));
	}
	
	
	    public int longestConsecutive(int[] nums) {
	        if(nums.length==0){
	            return 0;
	        }

	        HashSet<Integer> hs = new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            hs.add(nums[i]);
	        }
	        int longestSub=1;

	        for(int n:hs){
	            if(hs.contains(n-1)){
	                continue;
	            }
	            else{
	                int currentNum =n;
	                int currentSub = 1;
	                while(hs.contains(currentNum+1)){
	                    currentNum++;
	                    currentSub++;
	                }
	                longestSub = Math.max(longestSub, currentSub);
	            }
	        }
	        return longestSub;
	    }
}
