package StringsPackage;

import java.util.Arrays;
import java.util.Collections;

public class MakeLargestSum {

	public static void Largest(Integer arr[]) {
		Arrays.sort(arr, Collections.reverseOrder());
		StringBuilder x = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			x.append(arr[i]);
		}
		System.out.println(x.toString());
	}

	public static void main(String args[]) {
		Integer arr[] = { 3, 9, 1, 0 };
		Largest(arr);
	}
}
