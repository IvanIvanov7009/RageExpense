import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        for (int i = a; i <= b; i++) {

            int fd = i /1000;
            int sd = i /100%10;
            int td = i /10%10;
            int fod = i %10;
            if((fd%2==0) || (sd%2==0) || (td%2==0) || (fod%2==0)){

            }else {
                System.out.print(i+" ");}

            //for (int j = 0; j < currantNum.length(); j++) {

               // int digit = Integer.parseInt(String.valueOf(currantNum.charAt(j)));

              //  if (digit % 2 == 0) {
               //      break;
                }
                }
            }





