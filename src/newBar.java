
public class newBar {
    public static void main(String[] args) {
        generateAndPrintValidCombinations();
    }

    public static void generateAndPrintValidCombinations() {
        for (int num1 = 1000; num1 <= 9999; num1++) {
            for (int num2 = 1000; num2 <= 9999; num2++) {
                if (!hasEvenDigitsBetween(num1, num2)) {
                    System.out.println(num1 + " " + num2);
                }
            }
        }
    }

    public static boolean hasEvenDigitsBetween(int start, int end) {
        int digit1 = start / 1000;
        int digit2 = (start / 100) % 10;
        int digit3 = (end / 1000);
        int digit4 = (end / 100) % 10;

        for (int i = digit1 + 1; i < digit2; i++) {
            if (i % 2 == 0) {
                return true;
            }
        }

        for (int i = digit2 + 1; i < digit3; i++) {
            if (i % 2 == 0) {
                return true;
            }
        }

        for (int i = digit3 + 1; i < digit4; i++) {
            if (i % 2 == 0) {
                return true;
            }
        }

        return false;
    }
}
