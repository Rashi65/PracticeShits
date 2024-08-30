package StringsPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

	public static void main(String args[]) {
		List<String> list = Arrays.asList("Rashi", "Gupta", "Ratan", "Jawale");
		String result = encode(list);
		System.out.println(result);
		List<String> resultList = decode(result);
		for (String x : resultList) {
			System.out.println(x.toString());
		}
	}

	public static String encode(List<String> list) {
		StringBuilder rstr = new StringBuilder();
		if (list.size() == 0) {
			return Character.toString((char) 258);
		}
		String separator = Character.toString((char) 257);
		for (String s : list) {
			rstr.append(s);
			rstr.append(separator);
		}
		rstr.deleteCharAt(rstr.length() - 1);
		return rstr.toString();
	}

	public static List<String> decode(String str) {

		if (str.equals(Character.toString((char) 258))) {
			return new ArrayList<>();
		}
		String separator = Character.toString((char) 257);
		return Arrays.asList(str.split(separator, -1));
	}
}
