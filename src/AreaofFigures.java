import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String typeoffig=sc.nextLine();

        if(typeoffig.equals("square")) {

            double side = Double.parseDouble(sc.nextLine());
            double area = side*side;
            System.out.println(area);
            
        } else if (typeoffig.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double area= a*b;
            System.out.println(area);

        } else if (typeoffig.equals("circle")) {
            double rad= Double.parseDouble(sc.nextLine());
            double area=rad*rad*Math.PI;
            System.out.println(area);


        } else if ( typeoffig.equals("triangle")){
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double area = a*b/2;
            System.out.println(area);
        }

    }
}
