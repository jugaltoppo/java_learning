import java.util.Scanner;

public class readingUserInput
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum=0;
        while(count<10)
        {
            int counter=count+1;
            System.out.println("enter no." + counter);
            boolean isInt= scanner.hasNextInt();
            if(isInt)
            {
                int number =scanner.nextInt();
                sum= sum+number;
                count++;

            }
            else
            {
                System.out.println("Invalid Number");

            }
            scanner.nextLine();
        }
        System.out.println("The sum of 10 numbers is" + sum);
        scanner.close();
    }
}
