package TestofMain;

import java.util.Scanner;

public class ArmstrongBetwenTooNumbers {

        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

             int low =sc.nextInt();
             int high =sc.nextInt();

            for(int number = low + 1; number < high; ++number) {
                int digits = 0;
                int result = 0;
                int originalNumber = number;

                // number of digits calculation
                while (originalNumber != 0) {
                    originalNumber /= 10;
                    ++digits;
                }

                originalNumber = number;

                // result contains sum of nth power of its digits
                while (originalNumber != 0) {
                    int remainder = originalNumber % 10;
                    result += Math.pow(remainder, digits);
                    originalNumber /= 10;
                }

                if (result == number) {
                    System.out.print(number + " ");
                }
            }
        }
    }

//153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 е число на Армстронг.
//abcd... = a n + b n + c n + d n + ...a na stepen n