/**
 * Created by Troy on 9/14/16.
 */
public class Person {
    String name;
    String option;
    int moneyAmount;
    boolean keepRunning = true;

    void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        if(name.equalsIgnoreCase("")) {
            throw new Exception("Please enter your name");
        }
    }

    void chooseOption() throws Exception {
        while (keepRunning) {
            System.out.println("1.Check my balance, 2.Withdraw funds, 3.Cancel");
            option = ATM.scanner.nextLine();
            if (option.equalsIgnoreCase("Check my balance")) {
                System.out.println("Your balance is $100");
            }
            else if (option.equalsIgnoreCase("Withdraw funds")) {
                System.out.println("Enter withdrawal amount");
                keepRunning = false;
            }
            else if (option.equalsIgnoreCase("Cancel")) {
                throw new Exception("Thank you and please come again");
            }
        }
    }

    void chooseAmount() throws Exception {
        moneyAmount = ATM.scanner.nextInt();
        if (moneyAmount <= 100) {
            System.out.println("Please take your money");
        }
        else {
            throw new Exception("Insufficient funds");
        }
    }
}
