public class Task3 {
    public static void printInvertedNumbers(int n) {
        for (int i=n; i>=1; i--) {
            int count = i;
            while (count > 0) {
                System.out.print("*");
                count--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printInvertedNumbers(3);
    }
}
