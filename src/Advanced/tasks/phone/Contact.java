package Advanced.tasks.phone;

public class Contact {

    //Fields

    private String name;
    private String phoneNumber;

    //Constructor
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //methods
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}
