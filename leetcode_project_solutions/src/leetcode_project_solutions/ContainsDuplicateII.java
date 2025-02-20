package leetcode_project_solutions;
import java.util.HashMap;


public class ContainsDuplicateII {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,7};
		int k =3;
		ContainsDuplicateII d = new ContainsDuplicateII();
		System.out.println(d.containsNearbyDuplicate(arr, k));

	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && Math.abs(i - hm.get(nums[i])) <=k  ){
                return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }

}
//there should be duplicate value but also the indices should be different. and less than or equal to k value.


//7 is duplicate
//first 7 is  - 6
//second 7 is -9
//9-6 = 3

//O(n)

/*
Set<Integer> set = new HashSet<>();
for (int i = 0; i < nums.length; i++) {
    if (set.contains(nums[i])) {
        return true;
    }
    set.add(nums[i]);

    if (set.size() > k) {
        set.remove(nums[i - k]);
    }
}

return false;

//this is sliding windown + hash set concept

*/