package cap15.pag357;

class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withDraw(int amount) {
        balance = balance - amount;
    }
}

public class RyanAndMonicaJob implements Runnable{

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();

        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Estouro!");
            }
        }
    }

    private void makeWithdrawal(int i) {
    }
}
