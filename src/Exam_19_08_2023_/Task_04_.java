package Exam_19_08_2023_;

import java.util.Scanner;

public class Task_04_ {
    public static void main(String[] args) {
        double averigGold=0;

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i <n ; i++) {
            double midOfGold=sc.nextDouble();
            int m =sc.nextInt();
            for (int j = 0; j < m; j++) {
                double deilyGold= sc.nextDouble();
                averigGold=averigGold+deilyGold;



            }
            averigGold=averigGold/m;
            if(averigGold>=midOfGold ){
                System.out.printf("Good job! Average gold per day: %.2f",averigGold);
            } else{
                System.out.printf("You need %.2f gold.",Math.abs(averigGold-midOfGold));
            }
            averigGold=0;
        }


    }
}
