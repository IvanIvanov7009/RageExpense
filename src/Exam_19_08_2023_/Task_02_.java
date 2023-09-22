package Exam_19_08_2023_;

import java.util.Scanner;

public class Task_02_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbreOfAmd=sc.nextInt();
        int numbreOfPiple=sc.nextInt();
        int workingDay=sc.nextInt();
        double produse =numbreOfPiple*workingDay*8;
        double produsForOne =Math.floor(produse/3);
         if (produsForOne>=numbreOfAmd){
             System.out.printf("Profit: -> %.2f BGN",Math.abs(produsForOne-numbreOfAmd)*110.10);

         } else {
             System.out.printf("Losses: -> %.2f BGN",(numbreOfAmd-produsForOne)*110.10);
         }



    }
}
