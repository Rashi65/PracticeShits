import java.util.Arrays;

public class ThreeSum {

    public static void threeSum(int[] array) {
        Arrays.sort(array); // Sort the array
        int k, j, i, sum;
        
        for (i = 0; i < array.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && array[i] == array[i - 1]) continue;
            
            j = i + 1;
            k = array.length - 1;
            
            while (j < k) {
                sum = array[i] + array[j] + array[k];
                if (sum == 0) {
                    System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    j++;
                    k--;
                    // Skip duplicates for j and k
                    while (j < k && array[j] == array[j - 1]) j++;
                    while (j < k && array[k] == array[k + 1]) k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { -1, 0, 1, 2, -1, -4 };
        threeSum(array);
    }
}
