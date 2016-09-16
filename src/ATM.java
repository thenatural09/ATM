import java.util.Scanner;

/**
 * Created by Troy on 9/14/16.
 */
public class ATM {
    static Scanner scanner = new Scanner(System.in);
    static boolean keepRunning = true;
    public static void main(String[] args) throws Exception {
            Person person = new Person();
            person.chooseName();
        while(keepRunning) {
            person.chooseOptions();
        }
    }
}

