/**
 * Created by Troy on 9/14/16.
 */
public class Person {
    String name;
    String option;
    int balance = 100;

    void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        if (name.equalsIgnoreCase("")) {
            throw new Exception("Please enter your name");
        }
    }

    void chooseOptions() throws Exception {
        System.out.println("1.Check my balance, 2.Withdraw funds, 3.Cancel");
        option = ATM.scanner.nextLine();
        if (option.equalsIgnoreCase("withdraw funds")) {
            System.out.println("Enter withdrawal amount");
            String withdrawal = ATM.scanner.nextLine();
            int withdrawalAmount = Integer.valueOf(withdrawal);
            if (withdrawalAmount <= balance) {
                System.out.println("Please take your money");
                balance = balance - withdrawalAmount;
            } else if (withdrawalAmount > balance) {
                throw new Exception("Insufficient funds");
            }
        }
        else if (option.equalsIgnoreCase("check my balance")) {
            System.out.println("Your balance is $" + balance);
        }
        if (option.equalsIgnoreCase("cancel")) {
            throw new Exception("Thank you and please come again");
        }
    }
}