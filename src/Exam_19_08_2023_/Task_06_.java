package Exam_19_08_2023_;

import java.util.Scanner;

public class Task_06_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int kgFood= Integer.parseInt(sc.nextLine());

          String  input=sc.nextLine();
        kgFood=kgFood*1000;
          int totalFood=0;
                  while (!input.equals("Adopted")){

                 int food = Integer.parseInt(input);
                 totalFood = totalFood + food;


              input = sc.nextLine();
          }
                  kgFood=kgFood-totalFood;
          if (kgFood>=0){
              System.out.printf("Food is enough! Leftovers: %d grams.%n",kgFood);
          } else {
              System.out.printf("Food is not enough. You need %d grams more.", Math.abs(kgFood));
          }
          }

    }

