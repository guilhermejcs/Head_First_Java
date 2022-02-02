package cap15.pag361;

class TestSync2 implements Runnable{

    private int balance;

    public void run() {
        for (int i = 0; i < 50; i++) {
            increment();
            System.out.println("Thread: " + Thread.currentThread().getName());
            System.out.println("balance is " + balance);
        }
    }

    public void increment() {
        int i = balance;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = i + 1;
    }
}

public class TestSyncTest2 {
    public static void main(String[] args) {
        TestSync2 job = new TestSync2();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}
