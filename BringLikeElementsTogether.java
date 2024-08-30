package StringsPackage;

import java.util.HashMap;
import java.util.Map;

public class BringLikeElementsTogether {

	public static void main(String args[]) {
		int arr[] = { 0, 1, 2, 0, 0, 0, 1, 2, 2, 2, 2, 1, 0, 1, 1, 5 };
		printLikewiseTogether(arr);
	}

	public static void printLikewiseTogether(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> x : map.entrySet()) {
			for (int i = 0; i < x.getValue(); i++) {
				arr[z] = x.getKey();
				z++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
