import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int firstTime= Integer.parseInt(sc.nextLine());
    int secondTime= Integer.parseInt(sc.nextLine());
    int treta= Integer.parseInt(sc.nextLine());
     int sum= firstTime+secondTime+treta;
     int min =sum/60;
     int sec = sum%60;
     if(sec<10){
         System.out.printf("%d:0%d",min,sec);
     }else {
         System.out.printf("%d:%d",min,sec);
     }

}
}