import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueLetters {

	public static String UniqueLetterss(String s) {
		char array[] = s.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
		}
		String h="";
		for(Map.Entry<Character, Integer> x:map.entrySet()) {
			if(x.getValue()>=1) 
				h+=x.getKey();
		}
		return h;
	}

	public static void main(String args[]) {
		String f = "cbacdcbc";
		String j = UniqueLetterss(f);
		System.out.println(j);
	}
}
