package PreExam_13_08_2023_;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double gpu =Double.parseDouble(sc.nextLine());
       double videoCard =Double.parseDouble(sc.nextLine());
       double ramMem =Double.parseDouble(sc.nextLine());
       int numberOfRam= Integer.parseInt(sc.nextLine());
        double discount =Double.parseDouble(sc.nextLine());
        double totalGpu=0;
        double totalVideoCard=0;
        double totalRamMem=0;
        double totalPrice=0;
         gpu=(gpu*1.57);
         totalGpu =gpu*(1-discount);
         videoCard=videoCard*1.57;
         totalVideoCard=videoCard*(1-discount);
         totalRamMem=(ramMem*1.57)*numberOfRam;

         totalPrice=totalGpu+totalVideoCard+totalRamMem;

          System.out.printf("Money needed - %.2f leva.",totalPrice);







    }
}
