package Projects;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String email;
    private String phone;
  public Contact(String name, String email, String phone) {
      this.name = name;
      this.email = email;
      this.phone = phone;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Email: "+email+", Phone: "+phone;
    }
}
public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public void addContact() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter PhoneNo: ");
        String phone = scanner.nextLine();
     Contact contact = new Contact(name, email, phone);
     contacts.add(contact);
        System.out.println("Contact Added Successfully");
    }
    public void viewContact() {
        if (contacts.isEmpty()){
            System.out.println("AddressBook is Empty");
        }else {
            System.out.println("------Contacts-----");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
    public void editContact() {
        if (contacts.isEmpty()){
            System.out.println("AddressBook is Empty. Nothing to edit");
        return;
        }
        System.out.println("Enter the name of the contact to edit.");
        String searchName= scanner.nextLine();
        for (Contact contact:contacts){
            if (contact.getName().equalsIgnoreCase(searchName))
                System.out.println("Enter your phone no.");
            String newPhoneNumber = scanner.nextLine();
            contact.setPhone(newPhoneNumber);

            System.out.println("Enter your Email.");
            String newEmail = scanner.nextLine();
            contact.setEmail(newEmail);

            System.out.println("Contact updated successfully!!");
        return;
        }
        System.out.println("Contact not found..");
    }
    public void deleteContact(){
        if (contacts.isEmpty()){
            System.out.println("Address book is empty. Nothing to delete");
        return;
        }
        System.out.println("Enter a contact to delete..");
        String searchName = scanner.nextLine();
        for (int i=0;i<contacts.size();i++){
            if (contacts.get(i).getName().equalsIgnoreCase(searchName)){
                contacts.remove(i);
                System.out.println("Contact deleted Successfully!!");
                return;
            }
        }
        System.out.println("Contact not found..");
    }
    public void displayMenu(){
        while (true){
            System.out.println("\n----- Address Book Menu------");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit.");

            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                   addContact();
                   break;
                case 2:
                    viewContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting the Address Book...GoodBye");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid try again");
            }

        }
    }
    public static void main(String[] args) {
      AddressBook addressBook = new AddressBook();
      addressBook.displayMenu();
    }
    
}