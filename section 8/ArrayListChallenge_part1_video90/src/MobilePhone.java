import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class MobilePhone
{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber)
    {
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact)
    {
        if(findContact(contact)>=0)
        {
            System.out.println("Contact is already on file");
            return false;
        }
        else
        {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        int position = findContact(oldContact);
        if(position>=0)
        {
            System.out.println(oldContact.getName() + "was  found" );
            myContacts.set(position,newContact);
            return true;
        }
        else
        {
            System.out.println(oldContact.getName() + "was replaced with" + newContact.getName() );
            return false;
        }
    }

    public boolean removeContatct(Contact contact)
    {
        int foundPosition=findContact(contact);
        if(foundPosition>=0)
        {
            myContacts.remove(contact);
            System.out.println(contact.getName() + "was removed");
            return true;
        }
        else
        {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
    }
    private int findContact(Contact contact)
    {
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String name)
    {
        int position = this.myContacts.indexOf(name);
        if(position>=0)
        {
            return position;
        }
        else
        {
            return -1;
        }
    }
    public String queryContact(Contact contact)
    {
        if(findContact(contact)>=0)
        {
            return contact.getName();
        }
        else
        {
            return null;
        }
    }

    public Contact queryContact(String name)
    {
        int position = findContact(name);
        if(position>=0)
        {
            return this.myContacts.get(position);
        }
        else
        {
            return null;
        }
    }
    public  void printContacts()
    {
        for (int i=0;i<this.myContacts.size();i++)
        {
            System.out.println(i+1 + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}