import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("564");

    public static void main(String[] args)
    {
        boolean check=true;
        printInstruction();
        while(check)
        {
            System.out.println("enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    mobilePhone.printContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    check=false;
                    break;
            }
        }

    }

    private static void addContact()
    {
        System.out.println("Enter the contact name");
        String name= scanner.nextLine();
        System.out.println("Enter the corresponding phone Number");
        String phoneNUmber=scanner.nextLine();
        Contact newContact = Contact.createContact(name,phoneNUmber);
        if(mobilePhone.addContact(newContact))
        {
            System.out.println("contact added successfully");
        }
        else
        {
            System.out.println("error adding contact");
        }
    }

    private static void removeContact()
    {
        System.out.println("enter the name of the contact");
        String name=scanner.nextLine();
        Contact existingContact=mobilePhone.queryContact(name);
        if(mobilePhone.removeContact(existingContact))
        {
            System.out.println("contact successfully removed");
        }
        else
        {
            System.out.println("Contact name does not exist");
        }

    }
    private static void  printInstruction()
    {
        System.out.println("\nAvailable actions:\npress");
        System.out.println(" 0 - to printInstruction\n" +
                "1 - to add contact\n" +
                "2 - to remove contact\n" +
                "3 - to print contact\n" +
                "4 - to update contact\n" +
                "5 - to close this application");
    }

    private static void updateContact()
    {
        System.out.println("Enter the name you want to modify");
        String name= scanner.nextLine();
        System.out.println("Enter the new contact name");
        String newName= scanner.nextLine();
        System.out.println("Enter te new phone Number");
        String newPhoneNumbr= scanner.nextLine();
        Contact newContact=Contact.createContact(newName,newPhoneNumbr);
        Contact oldContact = mobilePhone.queryContact(name);

        if(mobilePhone.updateContact(oldContact,newContact)){
            System.out.println("contact updated successfully");
        }
        else
        {
            System.out.println("error updating contact");
        }

    }
}
