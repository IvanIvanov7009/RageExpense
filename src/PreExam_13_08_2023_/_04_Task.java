package PreExam_13_08_2023_;

import java.util.Scanner;

public class _04_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double kg = 0;
        double gradus = 0;
        double totalKg = 0;
        double totalGr = 0;
        double midGr =0;
        for (int i = 0; i < n; i++) {
            kg = Double.parseDouble(sc.nextLine());
            gradus = Double.parseDouble(sc.nextLine());
              totalKg=totalKg+kg;
              totalGr=totalGr+kg*gradus;

        }
             midGr=totalGr/totalKg;

             System.out.printf("Liter: %.02f%n",totalKg);
             System.out.printf("Degrees: %.02f%n",midGr);
             if (midGr<38){
                       System.out.println("Not good, you should baking!");
             } else if (midGr>=38 && midGr<=42) {
                 System.out.println("Super!");
             } else{
                 System.out.println("Dilution with distilled water!");
             }

    }
}
