import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[rows][cols];

        // Process each layer
        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            int top = layer;
            int left = layer;
            int bottom = rows - 1 - layer;
            int right = cols - 1 - layer;

            // Store layer elements
            ArrayList<Integer> list = new ArrayList<>();

            // Top row
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                list.add(matrix[bottom][j]);
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                list.add(matrix[i][left]);
            }

            int size = list.size();

            // Rotate anti-clockwise
            int rotation = r % size;

            ArrayList<Integer> rotated = new ArrayList<>();

            for (int i = rotation; i < size; i++) {
                rotated.add(list.get(i));
            }

            for (int i = 0; i < rotation; i++) {
                rotated.add(list.get(i));
            }

            // Put rotated elements back

            int index = 0;

            // Top row
            for (int j = left; j <= right; j++) {
                result[top][j] = rotated.get(index++);
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                result[i][right] = rotated.get(index++);
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                result[bottom][j] = rotated.get(index++);
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                result[i][left] = rotated.get(index++);
            }
        }

        // Print result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
output:-
  3 4 8 12
2 11 10 16
1 7 6 15
5 9 13 14
