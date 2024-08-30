package StringsPackage;

public class MovingAllZeros {

	// {1,2,0,3,0,6,0}
	// {1,2,3,6,0,0,0}
	public static void moveZeros(int arr[]) {
		int arr2[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr2[index] = arr[i];
				index++;
			}
		}
		for (int i = index; i < arr.length; i++) {
			arr2[index] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 0, 3, 0, 6, 0 };
		moveZeros(arr);
	}
}
