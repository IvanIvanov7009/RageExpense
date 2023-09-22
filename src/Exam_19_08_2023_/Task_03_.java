package Exam_19_08_2023_;

import java.util.Scanner;

public class Task_03_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  team =sc.nextLine();
        String  suvenirs =sc.nextLine();
        int numberOfSuvenirs=Integer.parseInt(sc.nextLine());

        double price=0;
              if(team.equals("Argentina")){

                  if(suvenirs.equalsIgnoreCase("flags")){
                      price=numberOfSuvenirs*3.25;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("caps")){
                      price=numberOfSuvenirs*7.20;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);

                  } else if (suvenirs.equalsIgnoreCase("posters")) {
                      price=numberOfSuvenirs*5.10;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("stickers")) {
                      price=numberOfSuvenirs*1.25;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else{
                      System.out.println("Invalid stock!");
                  }
              } else if (team.equals("Brazil")) {

                  if(suvenirs.equalsIgnoreCase("flags")){
                      price=numberOfSuvenirs*4.20;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("caps")){
                      price=numberOfSuvenirs*8.50;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("posters")) {
                      price=numberOfSuvenirs*5.35;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("stickers")) {
                      price=numberOfSuvenirs*1.20;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else{
                      System.out.println("Invalid stock!");
                  }
              } else if (team.equals("Croatia")) {

                  if(suvenirs.equalsIgnoreCase("flags")){
                      price=numberOfSuvenirs*2.75;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("caps")){
                      price=numberOfSuvenirs*6.90;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("posters")) {
                      price=numberOfSuvenirs*4.95;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("stickers")) {
                      price=numberOfSuvenirs*1.10;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else{
                      System.out.println("Invalid stock!");
                  }

              } else if (team.equals("Denmark")) {

                  if(suvenirs.equalsIgnoreCase("flags")){
                      price=numberOfSuvenirs*3.10;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("caps")){
                     price=numberOfSuvenirs*6.50;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("posters")) {
                      price=numberOfSuvenirs*4.80;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else if (suvenirs.equalsIgnoreCase("stickers")) {
                      price=numberOfSuvenirs*0.90;
                      System.out.printf("Pepi bought %d %s of %s for %.2f lv.",numberOfSuvenirs,suvenirs,team,price);
                  } else{
                      System.out.println("Invalid stock!");
                  }
              } else   {
                  System.out.println("Invalid country!");

              }


              }








    }

