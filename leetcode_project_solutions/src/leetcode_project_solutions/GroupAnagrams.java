package leetcode_project_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] str = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		GroupAnagrams g = new GroupAnagrams();
		System.out.println(g.groupAnagrams(str));

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList<List<String>>(); // return new ArrayList();
		}
		HashMap<String, List<String>> hm = new HashMap<>(); // HashMap<String, List> hm = new HashMap<>();
		int[] count = new int[26];

		for (String s : strs) { // s= eat
			Arrays.fill(count, 0);
			for (char c : s.toCharArray()) { // c= e a t - convert str to array of characters
				count[c - 'a']++;
			}
			StringBuilder sb = new StringBuilder(""); // String is immutable; if u need to modify string us e
														// StringBuilder
			/*
			 * String s = "Hello"; s = s + " World"; // Creates a new String object
			 * System.out.println(s); // Output: "Hello World" "Hello" is stored in memory.
			 * "Hello World" is a new object, and s now refers to it. The original "Hello"
			 * is not changed, it just becomes unreferenced.
			 */
			for (int i = 0; i < 26; i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			System.out.println("sb " + sb);
			String key = sb.toString(); /*
										 * HashMap keys must be String, not StringBuilder. StringBuilder is mutable, so
										 * using it directly might cause incorrect behavior.
										 * sb.toString(); ensures we create a consistent, immutable key.
										 */
			System.out.println("key " + key);
			if (!hm.containsKey(key)) {
				hm.put(key, new ArrayList<String>());
			}
			hm.get(key).add(s);
		}
		return new ArrayList<>(hm.values());

	}
}
