package TestofMain;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Clock {

    public static void main(String[] args) {
        Timer timer = new Timer();

        // Използваме TimerTask за да дефинираме задачата, която ще се изпълнява на определени интервали
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Тук се изпълнява кодът, който искаме да се повтаря на определени интервали
                printCurrentTime();
            }
        };

        // Планираме задачата да се изпълни на всеки 1 секунда (1000 милисекунди)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    private static void printCurrentTime() {
        // Създаваме обект от тип Date, за да получим текущото време
        Date currentTime = new Date();

        // Използваме SimpleDateFormat за да форматираме времето според желания формат
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        // Принтираме текущото време
        System.out.println("Текущо време: " + sdf.format(currentTime));
    }
}
