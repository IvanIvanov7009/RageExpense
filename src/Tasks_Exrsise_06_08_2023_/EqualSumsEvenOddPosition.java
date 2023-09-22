package Tasks_Exrsise_06_08_2023_;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        for (int i = a; i <= b; i++) {
            String currantNum = String.valueOf(i);

            int evevSum = 0;
            int oddSum = 0;

            for (int j = 0; j < currantNum.length(); j++) {

                int digit = Integer.parseInt(String.valueOf(currantNum.charAt(j)));

                if (j % 2 == 0) {
                     evevSum+=digit;
                } else {
                    oddSum+=digit;

                }
            }
            if(evevSum==oddSum){
                System.out.print(currantNum + " ");
            }
        }
    }
}