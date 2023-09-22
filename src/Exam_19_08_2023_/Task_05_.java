package Exam_19_08_2023_;

import java.util.Scanner;

public class Task_05_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int s =sc.nextInt();
        for (int i = m; i >=n ; i--) {

            if(i%2==0 && i%3==0){
                if (i==s){
                    break;
                }
                System.out.print(i+" ");
            }
        }


    }
}
