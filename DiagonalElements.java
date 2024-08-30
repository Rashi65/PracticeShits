import java.util.Scanner;

public class DiagonalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][2];
        
        System.out.println("Enter the elements of the 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        DiagonalElements g = new DiagonalElements();
        g.diagonalElements(array);
        
        sc.close();
    }

    public void diagonalElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
    }
}
