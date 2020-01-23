import java.util.Scanner;

public class readingUserInput
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the birth year");
        boolean nextint = scanner.hasNextInt(); //to check if the next input is only number and not anything else
        if(nextint)
        {

            int year = scanner.nextInt();

            scanner.nextLine(); //handle next line character(enter key)
            System.out.println("enter your name");
            String name = scanner.nextLine();
            int age = 2018 - year;
            if (age > 0 && age < 100) {
                System.out.println("your age is " + age + " , and your name is " + name.toUpperCase());
            } else {
                System.out.print("invalid year");
            }
        }
        else
        {
            System.out.println("cannot parse the year");
        }

        scanner.close();
    }
}
