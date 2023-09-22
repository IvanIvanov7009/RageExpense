public class pin {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void generatePins() {
        for (int firstDigit = 0; firstDigit < 10; firstDigit += 2) {
            for (int secondDigit = 2; secondDigit < 8; secondDigit++) {
                for (int thirdDigit = 0; thirdDigit < 10; thirdDigit += 2) {
                    String pin = Integer.toString(firstDigit) + Integer.toString(secondDigit) + Integer.toString(thirdDigit);
                    System.out.println(pin);
                }
            }
        }
    }

    public static void main(String[] args) {
        generatePins();
    }
}
