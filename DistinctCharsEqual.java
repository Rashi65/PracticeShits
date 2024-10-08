package StringsPackage;

class DistinctCharsEqual {
	public boolean isItPossible(String word1, String word2) {
		int[] occ1 = findOccurance(word1);
		int[] occ2 = findOccurance(word2);

		for (int i = 0; i < 26; i++) {
			if (occ1[i] > 0) {
				for (int j = 0; j < 26; j++) {
					if (occ2[j] > 0) {
						swap(occ1, occ2, i, j);
						if (areDistinctEqual(occ1, occ2)) {
							return true;
						}
						swap(occ1, occ2, j, i);
					}
				}
			}
		}
		return false;
	}

	private boolean areDistinctEqual(int[] occ1, int[] occ2) {
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (occ1[i] > 0)
				count++;
			if (occ2[i] > 0)
				count--;
		}
		return count == 0;
	}

	private void swap(int[] occ1, int[] occ2, int i, int j) {
		occ1[i]--;
		occ2[i]++;
		occ1[j]++;
		occ2[j]--;
	}

	private int[] findOccurance(String word) {
		int[] occurance = new int[26];
		for (char c : word.toCharArray()) {
			occurance[c - 'a']++;
		}
		return occurance;
	}

	public static void main(String args[]) {
		DistinctCharsEqual obj = new DistinctCharsEqual();
		String a = "aab";
		String b = "abccde";
		System.out.println(obj.isItPossible(a, b));
	}
}
