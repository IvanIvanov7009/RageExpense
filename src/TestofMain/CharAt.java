package TestofMain;

import java.util.Scanner;

public class CharAt {
    private static char word1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word1 =word.charAt(0) ;
        if (word.equalsIgnoreCase("Y")){
            System.out.println("YES");
        }
        int i = 1548;
        int j = 2;

        String currantNum = String.valueOf(i);
        int digit = Integer.parseInt(String.valueOf(currantNum.charAt(j+1)));
       String digita = String.valueOf(currantNum.charAt(j-1));
       String digita1 = String.valueOf(currantNum.charAt(j-2));
        System.out.println(digit+digita+digita1);
        System.out.println(word1);
        System.out.println(25%10);


    }

}
