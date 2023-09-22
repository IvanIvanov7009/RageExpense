package Tasks_05_08_2023_;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <=59 ; j++) {
                if (j < 10){
                    System.out.printf("%d:0%d%n", i, j);
                }else {
                    System.out.println(i + ":" +  j);
                };
                Thread.sleep(1000);
                if(i==23 && j==59){
                    i=0;
                    j=0;
                }
            }

        }
    }

}
