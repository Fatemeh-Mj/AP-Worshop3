import java.util.*;

public class PhoneBook {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private int contactCount;

    public boolean addContact(Contact newContact) {
        Iterator <Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact contact = it.next();
            if (contact.getName().equals(newContact.getName()) && contact.getSurname().equals(newContact.getSurname())) {
                return false;
            }
        }
        contactCount++;
        contacts.add(newContact);
        return true;
    }

    public boolean deleteContact(String name, String surname) {
        Iterator <Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getName().equals(name) && c.getSurname().equals(surname)) {
                it.remove();
                contactCount--;
                return true;
            }
        }
        return false;
    }

    public void printTheDetailsOfTheGroup(String searchType, String searchWord) {
        Iterator <Contact> it = contacts.iterator();

        if (searchType.equalsIgnoreCase("group")) {
            while (it.hasNext()) {
                Contact c = it.next();
                if (c.getGroup().toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(c.toString());
                }
            }
        }

        else if (searchType.equalsIgnoreCase("email")) {
            while (it.hasNext()) {
                Contact c = it.next();
                if (c.getEmail().toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(c.toString());
                }
            }
        }

        else if (searchType.equalsIgnoreCase("firstname")) {
            while (it.hasNext()) {
                Contact c = it.next();
                if (c.getName().toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(c.toString());
                }
            }
        }

        else if (searchType.equalsIgnoreCase("lastname")) {
            while (it.hasNext()) {
                Contact c = it.next();
                if (c.getSurname().toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(c.toString());
                }
            }
        }

        else if (searchType.equalsIgnoreCase("address")) {
            while (it.hasNext()) {
                Contact c = it.next();
                if (c.getAddress().toString().toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(c.toString());
                }
            }
        }

        else if (searchType.equalsIgnoreCase("phonenumber")) {
            while (it.hasNext()) {
                Contact c = it.next();
                if (c.getPhoneNumber().toString().toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(c.toString());
                }
            }
        }
    }

    public void showAllContacts(String searchWord) {
        Iterator <Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getName().toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println(c.toString());
            }
            else if (c.getSurname().toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println(c.toString());
            }
            else if (c.getGroup().toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println(c.toString());
            }
            else if (c.getEmail().toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println(c.toString());
            }
            else if (c.getPhoneNumber().toString().toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println(c.toString());
            }
            else if (c.getAddress().toString().toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println(c.toString());
            }
        }
    }

    public void printContacts() {
        Iterator <Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            System.out.println(c.toString());
        }
        return;
    }
}
