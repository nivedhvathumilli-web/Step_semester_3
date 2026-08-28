public class NumberPyramidPattern {
    static void printNumberPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPyramid(4);
    }
}