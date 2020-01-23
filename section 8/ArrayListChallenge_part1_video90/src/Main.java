import java.util.Scanner;
public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("654654");
    public static void main(String[] args)
    {
        boolean quit=false;
        startPhone();
        printActions();
        while(!quit)
        {
            System.out.println("enter action: (6 to show availaible action");
            int action= scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Shutting down");
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }
    }

    private static void addNewContact()
    {
        System.out.println("enter contact name");
        String name=scanner.nextLine();
        System.out.println("Enter phone number");
        String phone=scanner.nextLine();
        Contact contact = Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(contact))
        {
            System.out.println("new contact added: name= " + name + " phone = " + phone  );
        }
        else
        {
            System.out.println("cannot add" + name + " already ob file");
        }
    }

    private static void startPhone()
    {
        System.out.println("Starting phone...");
    }

    private static void updateContact()
    {
        System.out.println("enter existing contact name");
        String name=scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact==null)
        {
            System.out.println("contact not found");
            return ;
        }
        System.out.println("Enter new conatact name");
        String newName= scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContact,newContact))
        {
            System.out.println("Successfully updated recore");
        }
        else
        {
            System.out.println("error updating recored");
        }
    }

    public static void removeContact() {
        System.out.println("enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("contact not found");
            return;
        }
        if (mobilePhone.removeContatct(existingContact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("error delecting contact");
        }

    }
    public static void queryContact() {
        System.out.println("enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Name " + existingContact.getName() + " Phone Number is " + existingContact.getPhoneNumber());
    }

    private static void printActions()
    {
        System.out.println("Availaible actions \n press");
        System.out.println("0 - to shut down \n" +
                            "1 - to print contacts \n" +
                            "2 - to add new contacts \n" +
                            "3 - to update an existing contact \n" +
                            "4 - to remove and existing contact \n" +
                            "5 - query if and existing contact exist \n" +
                            "6 - to print a list of available actions");
        System.out.println("choose your action: ");
    }
}
