public class Main {
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setFirstName("Jugal");
        person.setLastName("Toppo");
        person.setAge(22);
        System.out.println("First name is " + person.getFirstName() + " Last name is " + person.getLastName() + " And your age is " + person.getAge() + " years. And your full name is " + person.getFullName() );
    }
}
