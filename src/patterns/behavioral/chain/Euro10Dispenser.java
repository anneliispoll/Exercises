package patterns.behavioral.chain;

public class Euro10Dispenser implements DispenseChain{
    private DispenseChain chain;

    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {

        if(cur.getAmount() >= 10) {
            int num = cur.getAmount() / 10;
            int reminder = cur.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10€ note");
            if(reminder != 0){
                chain.dispense(new Currency(reminder));
            }
        } else {
            chain.dispense(cur);
        }
    }
}

