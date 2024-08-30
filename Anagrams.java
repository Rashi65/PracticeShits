import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String s = "abc bca cab cba";
        Anagrams d = new Anagrams();
        boolean result = d.checkAnagrams(s);
        System.out.println(result);
    }

    public Boolean checkAnagrams(String s) {
        String words[] = s.split(" ");
        char[] sortedFirstWord = new char[0];

        for (int i = 0; i < words.length; i++) {
            char[] charArray = words[i].toCharArray();
            char[] sortedArray = mergeSort(charArray, 0, charArray.length - 1);

            if (i == 0) {
                sortedFirstWord = sortedArray;
            } else {
                if (!Arrays.equals(sortedFirstWord, sortedArray)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Merge sort function
    public static char[] mergeSort(char[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
        return array;
    }

    // Merge function to merge two halves
    public static void merge(char[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] leftArray = new char[n1];
        char[] rightArray = new char[n2];

        // Manual array copying instead of System.arraycopy
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
