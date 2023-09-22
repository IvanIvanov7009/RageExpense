package foundamentals;

import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        int num = Integer.parseInt(number);
        int len = number.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            int factorN = 1;
            for (int j = digit; j > 1; j--) {
                factorN = factorN * j;
            }
            sum += factorN;
        }
        if (sum == num){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}