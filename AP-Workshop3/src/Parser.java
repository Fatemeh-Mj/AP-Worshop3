public class Parser {

    private String command;
    PhoneBook pb= new PhoneBook();

    public Parser(PhoneBook pb) {
        this.pb = pb;
    }

    public void parse(String command) {
        this.command = command;

        if (command.startsWith("contacts -a")) {
            String[] parts = command.split(" ");
            Contact newContact = new Contact(parts[2], parts[3]);
            pb.addContact(newContact);
            newContact.set();
        }

        else if (command.startsWith("contacts -r")) {
            String[] parts = command.split(" ");
            String output;
            output = pb.deleteContact(parts[2], parts[3]) ? "Ok" : "Not found";
            System.out.println(output);
        }

        else if (command.startsWith("show -g")) {
            String[] parts = command.split(" ");
            pb.printTheDetailsOfTheGroup(parts[2], parts[3]);
        }

        else if (command.startsWith("show -c")) {
            String[] parts = command.split(" ");
            pb.showAllContacts(parts[2]);
        }

        else if (command.startsWith("show")) {
            String[] parts = command.split(" ");
            pb.printContacts();
        }
    }
}