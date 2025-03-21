package leetcode_project_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {

	public static void main(String[] args) {
		// List<String> strs = new ArrayList<>() ; // crt
		List<String> strs = Arrays.asList("Hello", "World");
		EncodeAndDecodeStrings e = new EncodeAndDecodeStrings();
		System.out.println(e.decode(e.encode(strs)));
	}

	// Encodes a list of strings to a single string.
	public String encode(List<String> strs) {
		if (strs.size() == 0) {
			return Character.toString((char) 258); // (char) 258 -> converting int 258 to char
													// explicit casting,
		}
		StringBuilder sb = new StringBuilder();
		String extracharacter = Character.toString((char) 257); // convertitng to string for performinh split operation.
		// split works for string not for character.
		for (String s : strs) {
			sb.append(s);
			sb.append(extracharacter);
		}

		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();

	}

	// Decodes a single string to a list of strings.
	public List<String> decode(String s) {
		if (s.equals(Character.toString((char) 258))) {
			return new ArrayList<String>();
		}
		String extracharacter = Character.toString((char) 257);

		String[] finalstr = s.split(extracharacter, -1); // -1 Keeps all empty strings in the result.
		return Arrays.asList(finalstr);
	}

	// Your Codec object will be instantiated and called as such:
	// Codec codec = new Codec();
	// codec.decode(codec.encode(strs));

}
