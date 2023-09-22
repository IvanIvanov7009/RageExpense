import java.util.Scanner;

public class _06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double oldrecord=Double.parseDouble(sc.nextLine());
        double distace=Double.parseDouble(sc.nextLine());
        double timeinsec=Double.parseDouble(sc.nextLine());

        double newtime= distace*timeinsec;
        double slower=Math.floor (distace/15)*12.5;
        double totaltime =newtime+slower;
        double dif= Math.abs(oldrecord-totaltime);

        if( oldrecord<=totaltime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.",dif);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totaltime);
        }

    }

}
