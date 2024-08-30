package StringsPackage;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingInteger {

	public static void nonRepeat(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer> mp:map.entrySet()) {
			if(mp.getValue()==1) {
				System.out.println(mp.getKey());
				break;
			}
		}
	}
	public static void main(String args[]) {
		int arr[]= {0,1,3,2,1,3,0,5,4,4,6};
		nonRepeat(arr);
	}
}
