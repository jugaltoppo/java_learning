import java.util.ArrayList;

public class MobilePhone {
    private String number;
    private  ArrayList<Contact> myContacts;

    public MobilePhone(String number)
    {
        this.number=number;
        this.myContacts=new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact)
    {
        if(findContact(contact.getName())>=0)
        {
            System.out.println("Contact already exist");
            return false;
        }
        else
        {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean removeContact(Contact contact)
    {
        if(findContact(contact)>=0)
        {
            myContacts.remove(contact);
            return true;
        }
        else
        {
            return false;
        }
    }


    private int findContact(String contactName)   // for addcontact() to check the contact array list by getName() only
    {
        for(int i=0;i<myContacts.size();i++)
        {
            Contact contact=myContacts.get(i);
            if(contact.getName().equals(contactName))
            {
                return i;
            }

        }
        return -1;
    }

    public Contact queryContact(String name) // to return the contact object for the string paramater name passed in the main function -> Contact existingContact=mobilePhone.queryContact(name);
    {
        int position = findContact(name);
        return myContacts.get(position);
    }

    private int findContact(Contact contact)    //for line 29 removeContact()
    {
        return myContacts.indexOf(contact);
    }

    public void printContact()
    {
        for (int i=0;i<myContacts.size();i++)
        {
            System.out.println(i+1 + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean updateContact(Contact oldContact,Contact newContact)
    {
        int position = findContact(oldContact.getName());
        if(position>=0)
        {
            if(findContact(newContact.getName())>=0)
            {
                System.out.println("contact name already exist");
                return false;
            }
            myContacts.set(position,newContact);
            return true;
        }
        else
        {
            return false;
        }
    }
}
