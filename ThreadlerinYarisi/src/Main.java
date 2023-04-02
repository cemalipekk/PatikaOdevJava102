import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadRaceApp q1 = new ThreadRaceApp();

        Thread t1 = new Thread(q1);
        Thread t2 = new Thread(q1);
        Thread t3 = new Thread(q1);
        Thread t4 = new Thread(q1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
