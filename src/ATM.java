import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Troy on 9/14/16.
 */
public class ATM {
    static Scanner scanner = new Scanner(System.in);
    static boolean keepRunning = true;
    static HashMap<String, Person> users = new HashMap<>();

    public static void main(String[] args) throws Exception {
        users.put("Alice", new Person("Alice", "helpme"));
        users.put("Bob", new Person("Bob", "thissucks"));

        Scanner scanner = new Scanner(System.in);

            Person person = new Person("Troy","Baseball");
            person.enterUsername();
            person.choosePassword();
        while (keepRunning) {
            person.chooseOptions();
        }
    }
}

//      Person person = new Person();
//        person.chooseName();
//        while(keepRunning) {
//        person.chooseOptions();

