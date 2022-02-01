package cap15.pag348;

public class MyRunnable implements Runnable {

    public void run() {
        go();
    }

    private void go() {
        doMore();
    }

    private void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        System.out.println("back in main");
    }
}
