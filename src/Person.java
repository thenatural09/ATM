import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Troy on 9/14/16.
 */
public class Person {
    String name;
    String option;
    static double balance = 100;
    String password;
    boolean keepRunning = true;
    ArrayList<String> names = new ArrayList<>();

    Person(String userName, String newPassword) {
        setName(userName);
        setPassword(newPassword);
    }
    void setName(String userName) {
        name = userName;
    }

    void enterUsername() throws Exception {
        System.out.println("Enter username:");
        name = ATM.customLine();

        if (ATM.users.containsKey(name)) {
            Person p = new Person(name,"mypassword");
            ATM.users.put(name, p);
            Person person = ATM.users.get(name);
            System.out.println("Logged in as: " + person.name);
        }
        else if(!ATM.users.containsKey(name)) {
            System.out.println("User does not exist. Please choose a username");
            name = ATM.customLine();
            if(name.equalsIgnoreCase("")) {
                throw new Exception("Please enter a valid username");
            }
            else System.out.println("Username created");
        }
        names.add(name);
    }

    void chooseOptions() throws Exception {
        while(keepRunning) {
            System.out.println("1.Check my balance, 2.Withdraw funds, 3.Cancel");
            option = ATM.customLine();
            if (option.equalsIgnoreCase("withdraw funds")) {
                System.out.println("Enter withdrawal amount");
                String withdrawal = ATM.scanner.nextLine();
                double withdrawalAmount = Integer.valueOf(withdrawal);
                if (withdrawalAmount <= balance) {
                    System.out.println("Please take your money");
                    balance = balance - withdrawalAmount;
                } else if (withdrawalAmount > balance) {
                    throw new Exception("Insufficient funds");
                }
            } else if (option.equalsIgnoreCase("check my balance")) {
                System.out.println("Your balance is $" + balance);

        }
        if (option.equalsIgnoreCase("cancel")) {
            System.out.println("Would you like to delete your account? Type yes or no");
            option = ATM.customLine();
            if(option.equalsIgnoreCase("yes")) {
                names.remove(name);
            }
            break;
        }
        }
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }

    void choosePassword() throws Exception {
        System.out.println("Please choose a password");
        String password = ATM.customLine();
        if(password.equalsIgnoreCase("")) {
            throw new Exception("Please start again and enter valid password");
        }
        else {
            System.out.println("Account created. Select an option:");
        }
    }
    void setPassword(String newPassword) {
        password = newPassword;
    }
}