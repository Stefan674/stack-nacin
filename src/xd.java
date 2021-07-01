import java.util.Scanner;

public class xd {
    int balance;
    int prevTran;
    String ime;
    String id;

    xd(String cusName, String cusID) {
        ime = cusName;
        id = cusID;
    }

    void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
            prevTran = balance;
        } else {
            System.out.println("What are you doing my guy?");
        }
    }

    void withdraw(int amouunty) {
        if(amouunty > 0 && amouunty <= balance) {
            balance = balance - amouunty;
            prevTran = -amouunty;
        } else {
            System.out.println("Not enough cash... learn basic math! :)");
        }
    }

    void prevTran() {
        if(prevTran > 0) {
            System.out.println("Deposited: " + prevTran);
        } else if(prevTran < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevTran));
        } else {
            System.out.println("No transaction");
        }
    }

    void interest(int years) {
        double intRate = 0.015;
        double newBalance = (years*intRate*balance) + balance;
        System.out.println("Current interest rate is " + (intRate*100) + "%");
        System.out.println("You will have " + newBalance + " after " + years + " years");
    }

    void loop() {
        char option = ' ';
        Scanner skener = new Scanner(System.in);
        System.out.println("Welcome, " + ime + "!");
        System.out.println("Your ID is: " + id);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");


        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option2 = skener.next().charAt(0);
            option = Character.toUpperCase(option2);
            System.out.println();

            switch (option) {
                case 'A':
                    System.out.println("Your balance is: " + balance);
                    break;

                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = skener.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = skener.nextInt();
                    withdraw(amount2);
                    break;
                case 'D':
                    prevTran();
                    break;
                case 'E':
                    System.out.println("Enter an amount of years: ");
                    int years = skener.nextInt();
                    interest(years);
                    break;
                case 'F':
                    System.out.println();
                    break;
                default:
                    System.out.println("Not valid a option, try again");
            }

        } while (option != 'F')   ;
        System.out.println("Thank YOU for banking with us!");
    }

}
