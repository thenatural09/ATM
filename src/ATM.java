import java.util.Scanner;

/**
 * Created by Troy on 9/14/16.
 */
public class ATM {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.chooseName();
        person.chooseOption();
        person.chooseAmount();
    }
}

