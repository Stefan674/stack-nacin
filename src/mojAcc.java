import java.util.Scanner;



    public class mojAcc {

        int balancee;
        int prevTran;
        String accName;
        String accID;

        mojAcc(String an, String aid) {
            accName = an;
            accID = aid;
        }

        void depo(int amountt) {

            if(amountt != 0) {
                balancee += amountt;
                prevTran = amountt;
            }
        }

        void with(int amountt) {
            if(amountt != 0) {
                balancee -= amountt;
                prevTran = amountt;
            }
        }

        void prevTran() {
            if(prevTran > 0) {
                System.out.println("Deposited: " + prevTran);
            } else if(prevTran < 0) {
                System.out.println("Withdrawn: " + prevTran);
            } else {
                System.out.println("No transaction occured");
            }
        }

        void calcInterest(int years) {
            double interestt = 0.015;
            double newBalance = (balancee * interestt * years) + balancee;
            System.out.println("The current interest rate is: " + (interestt*100) + "%");
            System.out.println("After " + years + " years, your balance will be " + newBalance);
        }

        void loop() {
            char optionn = ' ';
            Scanner scannerr = new Scanner(System.in);
            System.out.println("Welcome, " + accName + "!");
            System.out.println("Your ID is: " + accID);
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
                char option2 = scannerr.next().charAt(0);
                optionn = Character.toUpperCase(option2);
                System.out.println();

                switch(optionn) {
                    case 'A':
                        System.out.println("============================");
                        System.out.println("Your balance is: " + balancee);
                        System.out.println("============================");
                        break;

                    case 'B':
                        System.out.println("Enter an amount to deposit: ");
                        int amou = scannerr.nextInt();
                        depo(amou);
                        System.out.println();
                        break;

                    case 'C':
                        System.out.println("Enter an amount to withdraw: ");
                        int amou2 = scannerr.nextInt();
                        with(amou2);
                        System.out.println();
                        break;

                    case 'D':
                        System.out.println("============================");
                        prevTran();
                        System.out.println("============================");
                        break;

                    case 'E':
                        System.out.println("Enter how many years of accrued interest: ");
                        int years = scannerr.nextInt();
                        calcInterest(years);
                        break;

                    case 'F':
                        System.out.println("Enter how many years of accrued interest: ");
                        System.out.println();
                        break;
                }
            } while(optionn != 'F') ;
                System.out.println("NO, thank you");
        }
    }

