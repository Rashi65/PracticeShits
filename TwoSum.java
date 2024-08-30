package ArraysPackage;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 6, 9 };
		int z = 14;
		boolean result = calculate2Sum(arr, z);
		System.out.println(result);
	}

	public static boolean calculate2Sum(int arr[], int x) {
		Map<Integer, Integer> numMap = new HashMap<>();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int complement = x - arr[i];
			if (numMap.containsKey(complement)) {
				return true;
			}
			numMap.put(arr[i], i); // Add this line to add elements to the map
		}
		return false;
	}
}
