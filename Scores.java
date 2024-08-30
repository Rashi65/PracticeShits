
public class Scores {

	public static void scores(int[] array) {
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]<max && array[i]>max2) {
				max2=array[i];
			}
		}
		System.out.println("Max and Second Max nos: "+max+" and "+max2);
	}
	
	public static void main(String args[]) {
		int array[]= {1,5,3,7,2,4,10};
		scores(array);
	}	
}
