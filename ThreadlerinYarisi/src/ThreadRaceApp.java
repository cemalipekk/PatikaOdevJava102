import java.util.ArrayList;
import java.util.List;

public class ThreadRaceApp implements Runnable {
    List<Integer> single = new ArrayList<>();
    List<Integer> couple = new ArrayList<>();


    List<Integer> thread1 = new ArrayList<>();
    List<Integer> thread2 = new ArrayList<>();
    List<Integer> thread3 = new ArrayList<>();
    List<Integer> thread4 = new ArrayList<>();


    public void addArray() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.size() / 4) {
                thread1.add(i);
                thread2.add(i);
                thread3.add(i);
                thread4.add(i);
            }
        }
    }

    public synchronized void threadSync() {

        for (int i = 0; i <= 2500; i++) {
            if (i % 2 == 0) {
                couple.add(i);

            } else {
                single.add(i);

            }
        }
    }

    @Override
    public void run() {

        threadSync();


    }
}
