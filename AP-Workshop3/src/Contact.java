import java.util.*;

public class Contact {

    private String group;
    private String email;
    private String name;
    private String surname;
    private PhoneNumber phoneNumber = new PhoneNumber();
    private Address address = new Address();

    public Contact(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void set() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter contact's group:");
        setGroup(sc.nextLine());

        System.out.println("Please enter contact's email:");
        setEmail(sc.nextLine());

        System.out.println("Please enter contact's country code:");
        phoneNumber.setCountryCode(sc.nextLine());

        System.out.println("Please enter contact's phone number:");
        phoneNumber.setNumber(sc.nextLine());

        System.out.println("Please enter contact's zip code:");
        address.setZipCode(sc.nextLine());

        System.out.println("Please enter contact's country:");
        address.setCountry(sc.nextLine());

        System.out.println("Please enter contact's city:");
        address.setCity(sc.nextLine());

        System.out.println("Contact saved!");
    }


    @Override
    public String toString() {
        String contact;
        contact = "Contact {\n\tGroup: " + group + "\n\tEmail: "+ email +"\n\tName: "+ name+"\n\tSurname: "+ surname+"\n\tPhoneNumber: "+ phoneNumber.toString()+"\n\tAddress: "+ address.toString() +"\n}";
        return contact;
    }
}
