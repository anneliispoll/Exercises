package patterns.behavioral.chain;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain c1;

    public static void main(String[] args) {

        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        while (true){
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if(amount % 10 != 0){
                System.out.println("ATM can only dispense 10, 20 and 50 EUR");
                return;
            }

            atmDispenseChain.c1.dispense(new Currency(amount));
        }

    }

    public ATMDispenseChain(){
        //initializing the chain
        c1 = new Euro50Dispenser();
        DispenseChain c2 = new Euro20Dispenser();
        DispenseChain c3 = new Euro10Dispenser();

        //set chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
}
