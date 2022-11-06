package Advanced.threads.bankaccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("IBAN4684646846674", 1000.0d);

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    account.deposit(1);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    account.withdraw(1);

                }
            }
        };

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        account.seeBalance();
    }
}
