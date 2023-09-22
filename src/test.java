
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String typeoffig=sc.nextLine();

        if(typeoffig.equals("square")) {

            double side = Double.parseDouble(sc.nextLine());
            double area = side*side;
            System.out.println(area);

        }  if (typeoffig.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double area= a*b;
            System.out.println(area);

        }  if (typeoffig.equals("circle")) {
            double rad= Double.parseDouble(sc.nextLine());
            double area=rad*rad*Math.PI;
            System.out.println(area);


        }  if ( typeoffig.equals("triangle")){
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double area = a*b/2;
            System.out.println(area);
        }
              if ("m".equals("n") && 12>=16){
                  System.out.println("Mr.");
              }else {
                  System.out.println("Master");
              }
                  }
}
