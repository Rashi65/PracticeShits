import java.util.*;
import java.util.Map.Entry;

public class SecondLargestWord {
	public void secondLargestWord(String sentence) {
		String words[] = sentence.split(" ");
		Map<String, Integer> freqMap = new HashMap<>();
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			freqMap.put(words[i], words[i].length());
			list1.add(words[i].length());
		}
		int l = list1.size();
		Collections.sort(list1);
		for (Entry<String, Integer> x : freqMap.entrySet()) {
			if (x.getValue() == list1.get(l - 2)) {
				System.out.println(x.getKey());
			break;
			}
		}

	}

	public static void main(String args[]) {
		String sentence = "abcthhffg defg higkl";
		SecondLargestWord obj = new SecondLargestWord();
		obj.secondLargestWord(sentence);
	}
}
