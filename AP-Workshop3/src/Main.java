import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();
        Parser parser = new Parser(pb);
        String command;


        while (true) {
            command = sc.nextLine();
            if (command.equals("exit")) {
                break;
            }
            parser.parse(command);
        }
    }
}