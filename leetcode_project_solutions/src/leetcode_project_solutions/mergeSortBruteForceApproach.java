package leetcode_project_solutions;
import java.util.Arrays;

public class mergeSortBruteForceApproach {

	public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(mergedArray)); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }
	
	//time complexity:O(m+n)+O((m+n)log(m+n))   = O((m+n)log(m+n))
	    public static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
	        int m = nums1.length, n = nums2.length;
	        int[] result = new int[m + n];

	        // Copy elements from nums1 and nums2 into result
	        for (int i = 0; i < m; i++) {
	            result[i] = nums1[i];
	        }
	        for (int i = 0; i < n; i++) {
	            result[m + i] = nums2[i];
	        }

	        // Sort the merged array
	        Arrays.sort(result);

	        return result;
	    }

	    
	}



