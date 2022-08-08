package com.bridgelabz.adddressbooksystem;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {
    ArrayList<ContactList> contactDetails = new ArrayList<>(); //Create an ArrayList object "contactDetails"
    Scanner sc = new Scanner(System.in);
    //Creating a method to add person details
    public void addPersonDetails() {
        ContactList info = new ContactList(); //Creating an object "info" for ContactList class
        //Entering details from User input
        System.out.print("Enter the First Name: ");
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
        contactDetails.add(info);  //Adding elements to the array list using add() method.
    }
    //Method to edit the details
    public void editDetails(String firstName) {
        // for each loop
        for (ContactList contact : contactDetails) {
            String name = contact.getFirstName();// "name" variable and store the first name that you want to edit.
            // if the first name matches with the entered name, using equals method
            if (name.equals(firstName)) {
                System.out.println("Enter the number to edit: ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip Code \n7. Contact Number \n8. Email Address");
                System.out.println("Enter value to update: ");
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter the first name You want to update");
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                        displayContacts();
                        break;
                    case 2:
                        System.out.println("Enter the Last name You want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        displayContacts();
                        break;
                    case 3:
                        System.out.println("Enter the Address You want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        displayContacts();
                        break;
                    case 4:
                        System.out.println("Enter the City You want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        displayContacts();
                        break;
                    case 5:
                        System.out.println("Enter the State You want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        displayContacts();
                        break;
                    case 6:
                        System.out.println("Enter the Zip code You want to update");
                        String updatedZipCode = sc.next();
                        contact.setZipCode(updatedZipCode);
                        displayContacts();
                        break;
                    case 7:
                        System.out.println("Enter the Contact number you want to update");
                        String updatedContact = sc.next();
                        contact.setContactNumber(updatedContact);
                        displayContacts();
                        break;
                    case 8:
                        System.out.println("Enter the email You want to update");
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
    public void displayContacts() {
        System.out.println(contactDetails);
    }
    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book)"); //Welcome Message
        Scanner sc = new Scanner(System.in);
        AddressBookMain person1 = new AddressBookMain();
        person1.addPersonDetails();
        person1.displayContacts();
        System.out.println("Enter the First Name you want to Edit");
        String edit = sc.next();
        person1.editDetails(edit); //calling editDetails method
    }
}
