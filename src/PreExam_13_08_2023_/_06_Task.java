package PreExam_13_08_2023_;

import java.util.Scanner;

public class _06_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int a= Integer.parseInt(sc.nextLine());
         int b= Integer.parseInt(sc.nextLine());
         int c= Integer.parseInt(sc.nextLine());
         int prime =0;
        for (int i = 1; i <=a ; i++) {
            for (int j = 2; j <=b; j++) {

                for (int k = 1; k <=c ; k++) {
                    if (i % 2 == 0 && (j % 2 != 0 || j==2) && k % 2 == 0 ) {
                        System.out.printf("%d%d%d ", i, j, k );
                    }

                }

            }
            
        }
         
         
         
        
    }


}
