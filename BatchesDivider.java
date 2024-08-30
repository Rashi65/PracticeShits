import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchesDivider {
	public static List<List<String>> divideEmailIntoBatches(List<String> emails) {
		Map<String, Integer> emailCo = new HashMap<>();
		int maxCount = 0;
		for (String email : emails) {
			emailCo.put(email, emailCo.getOrDefault(email, 0) + 1);
		}
		for (int count : emailCo.values()) {
			maxCount = Math.max(count, maxCount);
		}
		List<List<String>> batches = new ArrayList<>(Collections.nCopies(maxCount, null));
		for (int i = 0; i < maxCount; i++) {
			batches.set(i, new ArrayList<>());
		}
		Map<String, Integer> insertionIndices = new HashMap<>();
		for (String email2 : emails) {
			int index = insertionIndices.getOrDefault(email2, 0) % maxCount;
			batches.get(index).add(email2);
			insertionIndices.put(email2, insertionIndices.getOrDefault(email2, 0) + 1);
		}
		return batches;
	}

	public static void main(String args[]) {
		List<String> email = new ArrayList<>();
		email.add("xyx@g.com");
		email.add("xyx@g.com");
		email.add("abc@g.com");
		email.add("def@g.com");
		email.add("abc@g.com");

		List<List<String>> list = divideEmailIntoBatches(email);

		System.out.println(list);
	}

}
