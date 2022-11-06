package Advanced.threads.firstExample;

import java.util.Random;

public class Bread implements Runnable {


    private String name;
    int time;
    Random r = new Random();

    public Bread(String name){  //constructor
        this.name = name;
        time = r.nextInt(5000);
    }


    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name,time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
