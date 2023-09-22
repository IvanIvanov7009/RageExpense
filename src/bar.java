import java.util.Scanner;

public class bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        String textNum = String.valueOf(firstNum);
        String textNum2 = String.valueOf(secondNum);

        int firstStart = Integer.parseInt(String.valueOf(textNum.charAt(0)));
        int secondStart = Integer.parseInt(String.valueOf(textNum.charAt(1)));
        int thirdStart = Integer.parseInt(String.valueOf(textNum.charAt(2)));
        int fourthStart = Integer.parseInt(String.valueOf(textNum.charAt(3)));

        int firstEnd = Integer.parseInt(String.valueOf(textNum2.charAt(0)));
        int secondEnd = Integer.parseInt(String.valueOf(textNum2.charAt(1)));
        int thirdEnd = Integer.parseInt(String.valueOf(textNum2.charAt(2)));
        int fourthEnd = Integer.parseInt(String.valueOf(textNum2.charAt(3)));

        for (int i = firstStart; i <= firstEnd; i++) {
            for (int j = secondStart; j <= secondEnd; j++) {
                for (int k = thirdStart; k <= thirdEnd; k++) {
                    for (int l = fourthStart; l <= fourthEnd; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
