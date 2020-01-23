import java.util.Scanner;
public class minAndMaxChallenge
{
    public static void main (String[] args)
    {
        int count=0;
        int min=0;
        int max=0;
        Scanner jstscan = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the number");
            boolean check=jstscan.hasNextInt();
            if(check)
            {
                int num= jstscan.nextInt();
                if(count==0) // the problem here is when you enter value and then enter a invalid values 'max' value gets updated but 'min' value remains zero but according to problem min and max should be bot the equal value when only one value is entered.
                {
                    if(num>max)
                    {
                        max=num;
                    }
                    else if(num<min)
                    {
                        min=num;
                    }
                    count++;
                }
                else if(count!=0)
                {
                    if(num>max)
                    {
                        if (min==0)
                        {
                            min=max;
                        }
                        max=num;
                    }
                    else if(num<min)
                    {
                        if (max==0)
                        {
                            max=min;
                        }
                        min=num;
                    }
                    count++;
                }
            }
            else
            {
                System.out.println("min: " + min + " max: " + max);
                jstscan.nextLine();
                break;
            }
        }
    }
}