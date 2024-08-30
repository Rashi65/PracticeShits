package StringsPackage;

public class FirstIndex {

	public static void first(int arr[], int target) {
		StringBuilder x=new StringBuilder();
		String z="",target2="";
		for(int i=0;i<arr.length;i++) {
			x.append(arr[i]);
		}
		z=x.toString();
		target2=String.valueOf(target);
		int s=z.indexOf(target2);
		System.out.println(s);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,2,3,3,3,3,4,5};
		first(arr, 3);
	}
}
