package com.bridgelabz.adddressbooksystem;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class AddressBookMain {
    static ArrayList<ContactList> contactDetails = new ArrayList<>(); //Create an ArrayList object
    //Creating a method to add person details
    public static void addDetails() {
        Scanner sc = new Scanner(System.in);
        ContactList info = new ContactList();

        System.out.print("Enter the First Name : ");
        info.setFirstName(sc.nextLine());
        System.out.print("Enter the Last Name: ");
        info.setLastName(sc.nextLine());
        System.out.print("Enter the Address: ");
        info.setAddress(sc.nextLine());
        System.out.print("Enter the city: ");
        info.setCity(sc.nextLine());
        System.out.print("Enter the State: ");
        info.setState(sc.nextLine());
        System.out.print("Enter the zip Code: ");
        info.setZipCode(sc.nextLine());
        System.out.print("Enter the Contact Number: ");
        info.setContactNumber(sc.nextLine());
        System.out.print("Enter the Email Address: ");
        info.setEmailAddress(sc.nextLine());

        contactDetails.add(info);  //Adding elements to the array list
    }
    //Method to edit the details
    public void editDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name you want to edit ");
        String fName = sc.next();
        // for each loop
        for (ContactList contact : contactDetails) {
            String name = contact.getFirstName();//store the first name that you want to edit

            // if the first name matches with the entered name, using equals method
            if (name.equals(fName)) {
                System.out.println("Enter the number to edit respective info: ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip Code \n7. Contact Number \n8. Email Address");
                System.out.println("Enter value to update: ");
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter the first name you want to update");
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                        displayContacts();
                        break;
                    case 2:
                        System.out.println("Enter the Last name you want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        displayContacts();
                        break;
                    case 3:
                        System.out.println("Enter the Address you want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        displayContacts();
                        break;
                    case 4:
                        System.out.println("Enter the City you want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        displayContacts();
                        break;
                    case 5:
                        System.out.println("Enter the State you want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        displayContacts();
                        break;
                    case 6:
                        System.out.println("Enter the Zip Code you want to update");
                        String updatedZipCode = sc.next();
                        contact.setZipCode(updatedZipCode);
                        displayContacts();
                        break;
                    case 7:
                        System.out.println("Enter the Contact Number you want to update");
                        String updatedContact = sc.next();
                        contact.setContactNumber(updatedContact);
                        displayContacts();
                        break;
                    case 8:
                        System.out.println("Enter the Email Address you want to update");
                        String updatedEmail = sc.next();
                        contact.setEmailAddress(updatedEmail);
                        displayContacts();
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
            } else {
                System.out.println("Invalid details: Please Enter the valid first name.");
            }
        }
    }
    //Method to display the Array List
    public static void displayContacts() {
        for (ContactList contactsDetailsInfo : contactDetails) {

            System.out.println(contactsDetailsInfo);

        }
    }
    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter First Name for which you want to delete contact: ");
        String firstname = sc.next();
        Iterator<ContactList> removeContact = contactDetails.iterator();
        //  Checking the next element untill last element remain

        while (removeContact.hasNext())
        {
            //  going to next element
            ContactList nextElement = removeContact.next(); //object for Contactlist class
            if (nextElement.getFirstName().equals(firstname) ) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            }
            else {
                System.out.println("Contact not found.");
            }
        }
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain addressDetails = new AddressBookMain();
        int chooseNumber;

        do {
            System.out.println("Enter the number ");
            System.out.println("1. Add Details \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber) {
                case 1:
                    System.out.println("Add Details: ");
                    addressDetails.addDetails();
                    break;
                case 2:
                    System.out.println("Edit details: ");
                    addressDetails.editDetails();
                    break;
                case 3:
                    System.out.println("Delete Details: ");
                    addressDetails.deleteContact();
                    break;
                case 4:
                    System.out.println("Display details: ");
                    displayContacts();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Option, Please select (1 to 5): ");
                    break;
            }
        } while (chooseNumber != 5);
    }
}
