import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Troy on 9/14/16.
 */
public class ATM {

    static Scanner scanner = new Scanner(System.in);
    static boolean keepRunning = true;
    static Person person = new Person("Troy", "Baseball");
    static HashMap<String, Person> users = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while(keepRunning) {
            person.enterUsername();
            person.choosePassword();
            person.chooseOptions();
        }
        keepRunning = false;
    }


    static String customLine() {
        String line = scanner.nextLine();
        while(line.startsWith("/")){
            switch(line) {
                case "/exit":
                    System.exit(0);
                    break;
                case "/user":
                    for(String name : person.names) {
                        System.out.println(name);
                        System.out.println(Person.balance);
                    }
                    if (person.names.isEmpty()) {
                        System.out.println("There are no accounts");
                    }
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
            line = scanner.nextLine();
        }
        return line;
    }
}


