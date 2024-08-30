package StringsPackage;

import java.util.HashMap;
import java.util.Map;

public class MinorityElement {

	public static void main(String args[]) {
		int arr[] = { 4, 4, 2, 2,7, 8, 8, 9, 9 };
		int result = 0;
		result = getMinorityElement(arr);
		System.out.println(result);
	}

	public static int getMinorityElement(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int minValue = Integer.MAX_VALUE, minKey = 0;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> z : map.entrySet()) {
			if (z.getValue() < minValue) {
				minValue = z.getValue();
				minKey = z.getKey();
			}
		}
		return minKey;
	}
}
